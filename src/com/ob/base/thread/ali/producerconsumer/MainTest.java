package com.ob.base.thread.ali.producerconsumer;

import java.util.concurrent.TimeUnit;

/**
 * @Author: oubin
 * @Date: 2020/9/22 21:54
 * @Description:
 */
public class MainTest {
    public static Producer[] producers = new Producer[] { new Producer("ProducerA"), new Producer("ProducerB"), new Producer("ProducerC") };
    public static Consumer[] consumers = new Consumer[] { new Consumer("ConsumerA"), new Consumer("ConsumerB"), new Consumer("ConsumerC") };

    public static void main(String[] args) {

    }
}

class Producer {
    String name;

    public Producer(String name) {
        this.name = name;
    }


    public String produce() {
        return "produce data " + name;
    }
}

class Consumer {
    String name;

    public Consumer(String name) {
        this.name = name;
    }

    public String consume(String data) {
        return name + " consume data " + data;
    }
}

interface DataEngine {

    boolean putData(String data) throws InterruptedException;

    boolean putData(String data, long timeout, TimeUnit unit) throws InterruptedException;

    String getData() throws InterruptedException;
}