package com.ob.base.thread.review.b;

/**
 * @Author: oubin
 * @Date: 2020/8/11 12:39
 * @Description:
 */
public class SharedClass {

    private volatile int count = 1;

    public void aThread() {

        synchronized (this) {
            while (count < 100) {

                if (count % 2 == 0) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " count = " + count);
                    this.notifyAll();

                }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public void bThread() {

        synchronized (this) {
            while (count < 100) {

                if (count % 2 != 0) {
                    count++;
                    System.out.println(Thread.currentThread().getName() + " count = " + count);
                    this.notifyAll();
                }
                if (count == 100) {
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
