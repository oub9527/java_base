package com.ob.base.thread.bookdemo.d;

/**
 * @Author: oubin
 * @Date: 2019/6/4 14:53
 * @Description: Class锁可以对类的所有对象实例起作用。
 */
public class Main1 {

    public static void main(String[] args) {
        Service service1 = new Service();
        Service service2 = new Service();
        ThreadA threadA = new ThreadA(service1);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service2);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
