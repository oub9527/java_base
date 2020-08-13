package com.ob.base.thread.review.c;


/**
 * @Author: oubin
 * @Date: 2020/8/11 13:55
 * @Description:
 */
public class Ticket implements Runnable {

    private int totalTicket = 20;

    @Override
    public void run() {

        while (totalTicket > 0) {
            synchronized (this) {
                if (totalTicket > 0) {
                    totalTicket--;
                    System.out.println("当前线程" + Thread.currentThread().getName() + "执行操作，还剩下 + " + totalTicket + "张");
                } else {
                    System.out.println("没票了");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
