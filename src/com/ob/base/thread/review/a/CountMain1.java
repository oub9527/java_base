package com.ob.base.thread.review.a;

/**
 * @Author: oubin
 * @Date: 2020/8/11 12:25
 * @Description:
 */
public class CountMain1 {

    public static void main(String[] args) {

        CountThread countThread = new CountThread();
        Thread thread1 = new Thread(countThread, "线程A");
        Thread thread2 = new Thread(countThread, "线程B");

        thread1.start();
        thread2.start();
    }
}
