package com.ob.base.thread.bookdemo.g;

/**
 * @Author: oubin
 * @Date: 2019/6/5 10:09
 * @Description:
 */
public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        this.service.print();
    }
}
