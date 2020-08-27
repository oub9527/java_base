package com.ob.base.thread.ali.a;

/**
 * @Author: oubin
 * @Date: 2020/8/11 19:59
 * @Description:
 */
public class OrderPrint implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        while (count < 20) {
            synchronized (this) {
                if (count < 20) {
                    System.out.println(Thread.currentThread().getName() + " count = " + count ++);
                    this.notify();
                }
                if (count == 20) {
                    break;
                }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
