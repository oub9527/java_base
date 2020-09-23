package com.ob.base.designpattern.factoryfunction;

/**
 * @Author: oubin
 * @Date: 2020/9/23 09:54
 * @Description:
 */
public class AppleFactory implements IFruitFactory {

    @Override
    public Fruit fetchFruit() {
        return new AppleFruit();
    }
}
