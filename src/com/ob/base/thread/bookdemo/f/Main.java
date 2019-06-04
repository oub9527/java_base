package com.ob.base.thread.bookdemo.f;

/**
 * @Author: oubin
 * @Date: 2019/6/4 18:19
 * @Description: wait notify 简单案例
 */
public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
