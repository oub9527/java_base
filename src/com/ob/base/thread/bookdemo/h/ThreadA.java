package com.ob.base.thread.bookdemo.h;

/**
 * @Author: oubin
 * @Date: 2019/6/5 14:28
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
        while (true) {
            service.push();
        }
    }
}
