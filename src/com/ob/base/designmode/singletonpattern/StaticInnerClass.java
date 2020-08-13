package com.ob.base.designmode.singletonpattern;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:53
 * @Description:
 */
public class StaticInnerClass {

    private StaticInnerClass() {
    }

    public static final StaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }
}
