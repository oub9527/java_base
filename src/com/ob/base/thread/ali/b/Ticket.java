package com.ob.base.thread.ali.b;

/**
 * @Author: oubin
 * @Date: 2020/8/11 20:10
 * @Description:
 */
public class Ticket implements Runnable {

    private int total = 20;

    @Override
    public void run() {
        while (total > 0) {
            synchronized (this) {
                total--;
                if (total >= 0) {
                    System.out.println("抢到票" + Thread.currentThread().getName() + "剩余" + total);
                } else {
                    System.out.println("票买完了");
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
