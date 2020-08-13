package com.ob.base.thread.review.d;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:09
 * @Description:
 */
public class Repository {

    private List<String> list = new ArrayList<>();

    private int index = 0;

    public void push() {
        synchronized (this) {
            if (list.size() > 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            list.add("message" + index++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("线程生产了一条数据" + Thread.currentThread().getName() + list.get(0));
            System.out.println("当前长度 " + list.size());
            this.notifyAll();
        }
    }

    public void pop() {
        synchronized (this) {
            if (list.size() == 0) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程消费了一条数据" + Thread.currentThread().getName() + list.remove(0));
            System.out.println("当前长度 " + list.size());
            this.notifyAll();
        }
    }
}
