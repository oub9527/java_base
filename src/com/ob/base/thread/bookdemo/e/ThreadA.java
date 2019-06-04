package com.ob.base.thread.bookdemo.e;

/**
 * @Author: oubin
 * @Date: 2019/6/4 15:19
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
        String a = new String("AA");
        service.print(a);
    }
}
