package com.ob.base.designpattern.factoryfunction;

/**
 * @Author: oubin
 * @Date: 2020/9/23 10:02
 * @Description:
 */
public class LemonFactory implements IFruitFactory {

    @Override
    public Fruit fetchFruit() {
        return new LemonFruit();
    }
}
