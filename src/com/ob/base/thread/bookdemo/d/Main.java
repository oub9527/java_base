package com.ob.base.thread.bookdemo.d;

/**
 * @Author: oubin
 * @Date: 2019/6/4 14:43
 * @Description: 异步的原因是持有不同的锁，一个是对象锁，一个是Class锁。判断多线程是否同步异步执行的一点是要看是否持有同一个锁。
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
