package com.ob.base.thread.bookdemo.h;

/**
 * @Author: oubin
 * @Date: 2019/6/5 14:41
 * @Description: 一生产者一消费者，List的最大容量是1
 */
public class Main {

    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.start();
        threadB.start();
    }
}
