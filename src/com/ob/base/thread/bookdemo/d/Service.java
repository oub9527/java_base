package com.ob.base.thread.bookdemo.d;

/**
 * @Author: oubin
 * @Date: 2019/6/4 14:35
 * @Description:
 */
public class Service {

    synchronized public static void printA() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入A");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开A");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public static void printB() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入B");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void printC() {
        try {
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 进入C");
            Thread.sleep(3000);
            System.out.println("线程名称为：" + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + " 离开C");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
