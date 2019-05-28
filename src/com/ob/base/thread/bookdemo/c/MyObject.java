package com.ob.base.thread.bookdemo.c;

/**
 * @Author: oubin
 * @Date: 2019/5/28 15:06
 * @Description:
 */
public class MyObject {

    synchronized public void methodA() {
        System.out.println("Thread Name = " + Thread.currentThread().getName() + " MethodA");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Thread " + System.currentTimeMillis() + " MethodA");
    }

    public void methodB() {
        System.out.println("Thread Name = " + Thread.currentThread().getName() + " MethodB");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End Thread " + System.currentTimeMillis() + " MethodB");
    }
}
