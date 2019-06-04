package com.ob.base.thread.bookdemo.f;


/**
 * @Author: oubin
 * @Date: 2019/6/4 18:16
 * @Description:
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        synchronized (lock) {
            System.out.println("开始   wait time = " + System.currentTimeMillis());
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束   wait time = " + System.currentTimeMillis());


        }
    }
}
