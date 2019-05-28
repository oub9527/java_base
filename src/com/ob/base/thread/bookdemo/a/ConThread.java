package com.ob.base.thread.bookdemo.a;

/**
 * @Author: oubin
 * @Date: 2019/5/27 15:46
 * @Description:
 */
public class ConThread extends Thread {

    private int count = 5;

    @Override
    public void run() {
        count--;
        System.out.println("由 " + Thread.currentThread().getName() + "计算, count = " + count);


    }
}
