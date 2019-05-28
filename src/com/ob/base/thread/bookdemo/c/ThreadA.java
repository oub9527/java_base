package com.ob.base.thread.bookdemo.c;

/**
 * @Author: oubin
 * @Date: 2019/5/28 15:11
 * @Description:
 */
public class ThreadA extends Thread {

    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodA();
    }
}
