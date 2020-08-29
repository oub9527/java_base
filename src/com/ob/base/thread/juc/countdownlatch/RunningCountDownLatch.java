package com.ob.base.thread.juc.countdownlatch;

import java.util.concurrent.*;

/**
 * @Author: oubin
 * @Date: 2020/8/29 15:21
 * @Description:
 */
public class RunningCountDownLatch {

    public static void main(String[] args) {

        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                10,
                10,
                1,
                TimeUnit.MINUTES,
                new SynchronousQueue<>(),
                r -> {
                    Thread thread = new Thread(r);
                    thread.setName("当前线程" + Thread.currentThread().getName());
                    return thread;
                });

        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + "准备就绪,等待起跑命令");
                    begin.await();
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + "已经到达终点");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    end.countDown();
                }

            });
        }

        System.out.println("开始跑...");
        begin.countDown();

        System.out.println("等待大家跑完");

        try {
            end.await();
            System.out.println("跑步结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadPoolExecutor.shutdown();
    }
}
