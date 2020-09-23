package com.ob.base.designpattern.strategy;

/**
 * @Author: oubin
 * @Date: 2020/9/23 11:18
 * @Description:
 */
public class Travel {

    private IStrategy iStrategy;

    public Travel(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void travel() {
        iStrategy.byVehicle();
    }
}
