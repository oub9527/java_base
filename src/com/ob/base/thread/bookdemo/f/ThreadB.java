package com.ob.base.thread.bookdemo.f;

/**
 * @Author: oubin
 * @Date: 2019/6/4 18:18
 * @Description:
 */
public class ThreadB extends Thread {

    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("开始   notify time = " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束   notify time = " + System.currentTimeMillis());

        }
    }
}
