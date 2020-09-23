package com.ob.base.designpattern.observer;

/**
 * @Author: oubin
 * @Date: 2020/9/23 10:20
 * @Description: 观察者
 */
public interface Observer {

    public void register(Subject subject);

    /**
     * 唤醒主题订阅者
     */
    public void update();
}
