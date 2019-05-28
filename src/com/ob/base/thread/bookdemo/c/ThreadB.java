package com.ob.base.thread.bookdemo.c;

/**
 * @Author: oubin
 * @Date: 2019/5/28 15:12
 * @Description:
 */
public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.methodB();
    }
}
