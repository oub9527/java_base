package com.ob.base.designpattern.singleton;

/**
 * @Author: oubin
 * @Date: 2020/9/22 21:12
 * @Description:
 */
public class SingletonOfInnerClass {

    private SingletonOfInnerClass() {

    }

    public static SingletonOfInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final SingletonOfInnerClass INSTANCE = new SingletonOfInnerClass();

    }
}
