package com.ob.base.thread.bookdemo.h;

/**
 * @Author: oubin
 * @Date: 2019/6/5 14:29
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
        while (true) {
            this.service.pop();
        }
    }
}
