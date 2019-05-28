package com.ob.base.thread.bookdemo.b;

/**
 * @Author: oubin
 * @Date: 2019/5/28 14:41
 * @Description: 如果线程访问的是不同的对象，则不会有线程安全问题，多个对象多个锁，简单看就是一个对象是否被多个线程共享
 * 关键字synchronized取得的锁都是对象锁，而不是把一段代码或者方法当做锁
 */
public class Main2 {

    public static void main(String[] args) {
        HasSelfPrivateNum has1 = new HasSelfPrivateNum();
        HasSelfPrivateNum has2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(has1);
        ThreadB threadB = new ThreadB(has2);
        threadA.start();
        threadB.start();
    }
}
