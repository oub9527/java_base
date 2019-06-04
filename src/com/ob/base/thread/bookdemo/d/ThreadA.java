package com.ob.base.thread.bookdemo.d;

/**
 * @Author: oubin
 * @Date: 2019/6/4 14:39
 * @Description:
 */
public class ThreadA extends Thread {

    private Service service;
    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        Service.printA();
    }
}
