package com.ob.base.thread.bookdemo.a;

/**
 * @Author: oubin
 * @Date: 2019/5/27 14:41
 * @Description:
 */
public class MyThreadMain {

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
