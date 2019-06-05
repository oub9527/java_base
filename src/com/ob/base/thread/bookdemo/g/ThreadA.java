package com.ob.base.thread.bookdemo.g;

/**
 * @Author: oubin
 * @Date: 2019/6/5 10:08
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
        this.service.print();
    }
}
