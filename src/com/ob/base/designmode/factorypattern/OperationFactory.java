package com.ob.base.designmode.factorypattern;

/**
 * @Author: oubin
 * @Date: 2019/5/22 10:31
 * @Description: 简单工厂模式
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+" : operation = new OperationAdd();
            break;
            case "-" : operation = new OperationSub();
            break;
        }
        return operation;
    }
}
