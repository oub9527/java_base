package com.ob.base.thread.ali.c;


/**
 * @Author: oubin
 * @Date: 2020/8/11 20:27
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();

        Producer producer = new Producer(repository);

        Consumer consumer = new Consumer(repository);

        Thread thread1 = new Thread(producer);

        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();

    }
}
