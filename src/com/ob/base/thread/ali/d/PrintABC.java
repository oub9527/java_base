package com.ob.base.thread.ali.d;

/**
 * @Author: oubin
 * @Date: 2020/8/22 14:04
 * @Description:
 */
public class PrintABC {

    private static volatile int count = 0;

    public static void main(String[] args) {

        Object object = new Object();

        new Thread(() -> {
            while (count < 9) {
                synchronized (object) {
                    if (count % 3 == 0) {
                        System.out.println("A");
                        count ++;
                        object.notifyAll();
                    }
                    if (count == 9) {
                        return;
                    }
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (count < 9) {
                synchronized (object) {
                    if (count % 3 == 1) {
                        System.out.println("B");
                        count ++;
                        object.notifyAll();
                    }
                    if (count == 9) {
                        return;
                    }
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            while (count < 9) {
                synchronized (object) {
                    if (count % 3 == 2) {
                        System.out.println("C");
                        count ++;
                        object.notifyAll();

                    }
                    if (count == 9) {
                        return;
                    }
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
