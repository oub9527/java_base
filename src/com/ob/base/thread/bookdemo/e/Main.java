package com.ob.base.thread.bookdemo.e;

/**
 * @Author: oubin
 * @Date: 2019/6/4 15:21
 * @Description: String的两个值都是AA，两个线程持有相同的锁，导致B线程不能执行。这是String常量池带来的问题。
 * 如果改成new String("AA")，那两个线程持有的就是不同的锁。
 * 比如可以new Object()实例化一个对象，但它并不放入缓存中
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
