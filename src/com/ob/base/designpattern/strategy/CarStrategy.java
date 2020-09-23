package com.ob.base.designpattern.strategy;

/**
 * @Author: oubin
 * @Date: 2020/9/23 11:16
 * @Description:
 */
public class CarStrategy implements IStrategy {

    @Override
    public void byVehicle() {
        System.out.println("by car");

    }
}
