package com.ob.base.thread.review.e;

/**
 * @Author: oubin
 * @Date: 2020/8/11 17:04
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Object object = new Object();
        new Thread(new PrintRunnable(object, 1)).start();
        new Thread(new PrintRunnable(object, 2)).start();
        new Thread(new PrintRunnable(object, 3)).start();
    }
}

class PrintRunnable implements Runnable {
    private static volatile int printNum = 0;

    private Object object;

    private int threadId;

    public PrintRunnable(Object object, int threadId) {
        super();
        this.object = object;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (printNum < 75) {
            synchronized (object) {
                if (printNum / 5 % 3 + 1 == threadId) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("线程" + threadId + ":" + (++printNum));
                    }
                    object.notifyAll();
                } else {
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}