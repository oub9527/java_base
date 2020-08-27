package com.ob.base.thread.ali.c;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: oubin
 * @Date: 2020/8/11 20:21
 * @Description:
 */
public class Repository {

    private List<String> list = new ArrayList<>();

    private int index = 0;

    public void push() {
        synchronized (this) {
            if (list.size() == 0) {
                list.add("message " + index ++);
                System.out.println("生产者生产消息 ：" + list.get(0));
                this.notify();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void pop() {
        synchronized (this) {
            if (list.size() > 0) {
                System.out.println("消费者消费消息 ：" + list.remove(0));
                this.notify();
            }
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
