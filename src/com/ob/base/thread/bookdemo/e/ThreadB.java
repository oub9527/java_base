package com.ob.base.thread.bookdemo.e;

/**
 * @Author: oubin
 * @Date: 2019/6/4 15:20
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
        String b = new String("AA");
        this.service.print(b);
    }
}
