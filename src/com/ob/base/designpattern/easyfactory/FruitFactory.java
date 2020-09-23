package com.ob.base.designpattern.easyfactory;

/**
 * @Author: oubin
 * @Date: 2020/9/23 09:43
 * @Description:
 */
public class FruitFactory {

    public Fruit fetchFruit(String type) {
        Fruit fruit = null;
        switch (type) {
            case "Apple":
                fruit = new Apple();
                break;
            case "Lemon":
                fruit = new Lemon();
                break;
        }
        return fruit;

    }
}
