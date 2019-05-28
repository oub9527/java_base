package com.ob.base.thread.bookdemo.a;

/**
 * @Author: oubin
 * @Date: 2019/5/27 16:09
 * @Description:
 */
public class ConThreadMain {

    public static void main(String[] args) {
        ConThread conThread = new ConThread();
        Thread thread1 = new Thread(conThread, "A");
        Thread thread2 = new Thread(conThread, "B");
        Thread thread3 = new Thread(conThread, "C");
        Thread thread4 = new Thread(conThread, "D");
        Thread thread5 = new Thread(conThread, "E");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
