package com.ob.base.thread.bookdemo.g;

/**
 * @Author: oubin
 * @Date: 2019/6/5 10:09
 * @Description: 方法wait直接释放锁，方法notify不直接释放锁，而是等同步方法执行完才释放锁
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service(new Object());
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
