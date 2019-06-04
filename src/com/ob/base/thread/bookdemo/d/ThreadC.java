package com.ob.base.thread.bookdemo.d;

/**
 * @Author: oubin
 * @Date: 2019/6/4 14:41
 * @Description:
 */
public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        super.run();
        service.printC();
    }
}
