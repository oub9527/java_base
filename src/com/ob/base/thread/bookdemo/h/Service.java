package com.ob.base.thread.bookdemo.h;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: oubin
 * @Date: 2019/6/5 14:16
 * @Description:
 */
public class Service {

    private List<String> list = new ArrayList<>();
    private int index = 0;

    public Service() {

    }

    public void push() {
        synchronized (list) {
            if (list.size() != 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add("消息 " + index++);
            System.out.println(Thread.currentThread().getName() + " 生产者生产一条消息 ： " + list.get(0));
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.notify();
            System.out.println("消息列表长度：" + list.size());

        }
    }

    public void pop() {
        synchronized (list) {
            if (list.size() == 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + " 消费者消费一条消息 ： " + list.remove(0));
            System.out.println("消息列表长度：" + list.size());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.notify();
        }
    }


}
