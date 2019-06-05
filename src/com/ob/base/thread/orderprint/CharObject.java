package com.ob.base.thread.orderprint;


/**
 * @Author: oubin
 * @Date: 2019/5/28 15:20
 * @Description:
 */
public class CharObject {

    private int index;

    public CharObject(int index) {
        this.index = index;
    }

    private char[] charAll = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public void print() {
        System.out.println("当前线程 ： " + Thread.currentThread().getName() + "  " + charAll[index++]);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
