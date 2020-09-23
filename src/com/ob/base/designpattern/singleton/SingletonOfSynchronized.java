package com.ob.base.designpattern.singleton;

/**
 * @Author: oubin
 * @Date: 2020/9/22 21:10
 * @Description: synchronized方式的单例模式
 */
public class SingletonOfSynchronized {

    private SingletonOfSynchronized() {

    }

    private static volatile SingletonOfSynchronized singletonOfSynchronized;

    public static SingletonOfSynchronized getInstance() {
        if (null == singletonOfSynchronized) {
            synchronized (SingletonOfSynchronized.class) {
                if (null == singletonOfSynchronized) {
                    singletonOfSynchronized = new SingletonOfSynchronized();
                }
            }
        }
        return singletonOfSynchronized;
    }
}
