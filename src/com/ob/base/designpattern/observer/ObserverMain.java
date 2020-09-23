package com.ob.base.designpattern.observer;

/**
 * @Author: oubin
 * @Date: 2020/9/23 11:03
 * @Description:
 */
public class ObserverMain {

    public static void main(String[] args) {
        WechatObserver wechatObserver = new WechatObserver();
        Subject subject = new SubjectSubscribe();
        wechatObserver.register(subject);
        wechatObserver.update();
    }
}
