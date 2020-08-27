package com.ob.base.thread.ali.a;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: oubin
 * @Date: 2020/8/11 20:02
 * @Description:
 */
public class ThreadMain {

    public static void main(String[] args) {
        OrderPrint orderPrint = new OrderPrint();
        Thread thread1 = new Thread(orderPrint);
        Thread thread2 = new Thread(orderPrint);
        thread1.start();
        thread2.start();
    }
}
