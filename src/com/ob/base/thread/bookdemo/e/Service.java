package com.ob.base.thread.bookdemo.e;


/**
 * @Author: oubin
 * @Date: 2019/6/4 15:17
 * @Description:
 */
public class Service {

    public void print(String param) {
        synchronized (param) {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
