package com.ob.base.thread.bookdemo.a;

/**
 * @Author: oubin
 * @Date: 2019/5/27 14:38
 * @Description:
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println("由 " + Thread.currentThread().getName() + "计算, count = " + count);
        }
    }
}
