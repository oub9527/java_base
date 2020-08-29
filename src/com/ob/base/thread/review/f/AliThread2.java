package com.ob.base.thread.review.f;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: oubin
 * @Date: 2020/8/13 12:03
 * @Description:
 */
public class AliThread2 {

    public static void main(String[] args) throws InterruptedException {

        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(16);

        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                while (true) {
                    try {
                        String take = blockingQueue.take();
                        parseLog(take);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }
        for (int i = 0; i < 16; i++) { // 此行不能动
            final String log = "" + (i + 1);  // 此行不能动
            blockingQueue.put(log);
        }
    }


    public static void parseLog(String log) throws InterruptedException {
        System.out.println(log + ":" + System.currentTimeMillis() / 1000 + " Thread Name : " + Thread.currentThread().getName());
        Thread.sleep(1000);
    }
}
