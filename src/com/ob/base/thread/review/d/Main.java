package com.ob.base.thread.review.d;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:18
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Repository repository = new Repository();

        Thread thread1 = new Thread(new Producer(repository));

        Thread thread2 = new Thread(new Consumer(repository));

        thread1.start();

        thread2.start();
    }
}
