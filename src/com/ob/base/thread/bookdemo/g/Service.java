package com.ob.base.thread.bookdemo.g;

/**
 * @Author: oubin
 * @Date: 2019/6/5 10:06
 * @Description:
 */
public class Service {

    private Object object;

    public Service (Object o) {
        this.object = o;
    }

    public void print() {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + " begin wait ...");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end wait ...");
        }
    }

    public void notifyMethod() {
        synchronized (object) {
            System.out.println(Thread.currentThread().getName() + " begin notify ...");
            object.notify();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " end notify ...");

        }
    }
}
