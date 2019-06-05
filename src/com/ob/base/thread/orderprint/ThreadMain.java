package com.ob.base.thread.orderprint;


/**
 * @Author: oubin
 * @Date: 2019/5/27 10:01
 * @Description: 线程A打印{'e','g','k','n','o'},其他线程B打印，顺序输出
 */
public class ThreadMain {

    public static void main(String[] args) {
        CharObject charObject = new CharObject(0);
        ThreadA threadA = new ThreadA(charObject);
        threadA.setName("A线程");
        ThreadB threadB = new ThreadB(charObject);
        threadB.setName("B线程");
        threadA.start();
        threadB.start();
    }
}
