package com.ob.base.thread.juc.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: oubin
 * @Date: 2020/8/29 14:19
 * @Description: ABC三个线程等待主线程执行countDown()方法后才可以执行
 *
 */
public class CountDownLatchTest {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);

        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");

        }).start();

        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");

        }).start();

        new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("C");

        }).start();

        countDownLatch.countDown();

    }
}
