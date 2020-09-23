package com.ob.base.designpattern.observer;

/**
 * @Author: oubin
 * @Date: 2020/9/23 10:50
 * @Description:
 */
public class SubjectSubscribe implements Subject {

    @Override
    public void notified() {
        System.out.println("消息订阅者被唤醒");

    }
}
