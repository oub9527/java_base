package com.ob.base.designpattern.observer;

/**
 * @Author: oubin
 * @Date: 2020/9/23 10:20
 * @Description: 主题
 */
public interface Subject {

    /**
     * 订阅主题的会被唤醒，提供唤醒接口
     */
    public void notified();

}
