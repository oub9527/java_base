package com.ob.base.thread.bookdemo.c;

/**
 * @Author: oubin
 * @Date: 2019/5/28 15:13
 * @Description: 对象锁锁住的是对象，同步方法需要等待，非synchronized方法不需要等待
 */
public class Main {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        ThreadA threadA = new ThreadA(myObject);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(myObject);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
