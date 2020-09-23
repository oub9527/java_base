package com.ob.base.designpattern.strategy;

/**
 * @Author: oubin
 * @Date: 2020/9/23 11:17
 * @Description:
 */
public class TrainStrategy implements IStrategy {

    @Override
    public void byVehicle() {
        System.out.println("by train");

    }
}
