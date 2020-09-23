package com.ob.base.thread.ali.producerconsumer.solve;


import java.util.Optional;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: oubin
 * @Date: 2020/9/22 21:54
 * @Description: * 实现一个生产者消费者的模型；
 * * 要求：
 * * 1）实现DataEngine，DataEngine是生产/消费模型类，生产者往engine放数据，消费者从engine消费数据，并且是并发安全的
 * * 2）实现main函数，能run成功，3个生产者在多线程场景下往DataEngine放数据，3个消费者在多线程场景下从DataEngine消费数据
 * * 3）加分项-考虑生产者 put DataEngine数据时，数据满了的场景处理
 * * 4）加分项-考虑消费者 consume DataEngine数据时，数据空了的场景处理
 */
public class MainTest {

    /**
     * 默认队列的长度是10
     */
    public static BlockingQueue<String> repository = new ArrayBlockingQueue<>(10);

    /**
     * 以原子自增的方式统计生产和消费的个数
     */
    public static AtomicInteger atomicInteger = new AtomicInteger();

    public static Producer[] producers = new Producer[]{new Producer("ProducerA"), new Producer("ProducerB"), new Producer("ProducerC")};
    public static Consumer[] consumers = new Consumer[]{new Consumer("ConsumerA"), new Consumer("ConsumerB"), new Consumer("ConsumerC")};

    public static void main(String[] args) {

        for (Producer producer : producers) {
            Thread thread = new Thread(producer);
            thread.start();
        }

        for (Consumer consumer : consumers) {
            Thread thread = new Thread(consumer);
            thread.start();
        }

    }
}

class Producer implements DataEngine, Runnable {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public String produce() {
        return "produce data " + name;
    }

    /**
     * 先尝试以非阻塞的方式插入，同时直接返回插入状态
     * @param data
     * @return
     * @throws InterruptedException
     */
    @Override
    public boolean putData(String data) throws InterruptedException {
        String message = produce() + ":" + data;
        boolean flag = MainTest.repository.offer(message);
        if (flag) {
            System.out.println(message);
        }
        return flag;
    }

    /**
     * 如果非阻塞方式插入失败，则先尝试在timeout时间内一直去插入消息
     * 如果在时间内还是插入失败，则队列会一直阻塞生产者线程
     * @param data
     * @param timeout
     * @param unit
     * @return
     * @throws InterruptedException
     */
    @Override
    public boolean putData(String data, long timeout, TimeUnit unit) throws InterruptedException {
        String message = produce() + ":" + data;
        boolean offer = MainTest.repository.offer(message, timeout, unit);
        if (!offer) {
            MainTest.repository.put(message);
        }
        System.out.println(message);
        return true;
    }

    @Override
    public String getData() throws InterruptedException {
        return null;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = String.valueOf(MainTest.atomicInteger.incrementAndGet());
                boolean flag = putData(message);
                if (!flag) {
                    putData(message, 1, TimeUnit.SECONDS);
                }
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

class Consumer implements DataEngine, Runnable {

    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    public String consume(String data) {
        return name + " consume data " + data;
    }

    @Override
    public boolean putData(String data) throws InterruptedException {
        return false;
    }

    @Override
    public boolean putData(String data, long timeout, TimeUnit unit) throws InterruptedException {
        return false;
    }

    /**
     * 如果队列中无消息，则方法一直阻塞
     * @return
     * @throws InterruptedException
     */
    @Override
    public String getData() throws InterruptedException {
        String data = MainTest.repository.take();
        String message = Optional.of(data).map(str -> str.split(":")).map(array -> array[1]).orElse(null);
        return consume(":" + message);
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(getData());
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

interface DataEngine {

    boolean putData(String data) throws InterruptedException;

    boolean putData(String data, long timeout, TimeUnit unit) throws InterruptedException;

    String getData() throws InterruptedException;
}