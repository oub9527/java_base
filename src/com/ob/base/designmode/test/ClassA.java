package com.ob.base.designmode.test;

/**
 * @Author: oubin
 * @Date: 2019/8/29 16:09
 * @Description:
 */
public class ClassA extends AbstractClass {

    @Override
    public NeedClass chooseOne(Object o) {
        return new NeedClass();
    }
}
