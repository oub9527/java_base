package com.ob.base.designmode.test;

/**
 * @Author: oubin
 * @Date: 2019/8/29 16:14
 * @Description:
 */
public class FunContext extends AbstractClass {

    AbstractClass abstractClass;

    public FunContext(Object o) {
        if (o instanceof ClassA) {
            abstractClass = new ClassA();
        } else if (o instanceof ClassB) {
            abstractClass = new ClassB();
        }
    }

    @Override
    public NeedClass chooseOne(Object o) {
        System.out.println("aa");
        return abstractClass.chooseOne(o);

    }
}
