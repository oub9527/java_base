package com.ob.base.thread.ali.d;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: oubin
 * @Date: 2020/8/27 21:40
 * @Description:
 */
public class PrintABC2 {

    public static Lock lock = new ReentrantLock();
    public static int state = 0;

    public static void main(String[] args) {

        new Thread(() -> {
            String letter = "A";
            for (int i = 0; i < 3;) {
                try {
                    lock.lock();
                    while (state % 3 == 0) {
                        System.out.println(letter);
                        i++;
                        state++;
                    }

                } finally {
                    lock.unlock();

                }
            }

        }).start();

        new Thread(() -> {
            String letter = "B";
            for (int i = 0; i < 3;) {
                try {
                    lock.lock();
                    while (state % 3 == 1) {
                        System.out.println(letter);
                        i++;
                        state++;
                    }

                } finally {
                    lock.unlock();

                }
            }
        }).start();

        new Thread(() -> {
            String letter = "C";
            for (int i = 0; i < 3;) {
                try {
                    lock.lock();
                    while (state % 3 == 2) {
                        System.out.println(letter);
                        i++;
                        state++;
                    }

                } finally {
                    lock.unlock();

                }
            }
        }).start();
    }
}
