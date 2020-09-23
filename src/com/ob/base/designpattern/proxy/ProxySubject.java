package com.ob.base.designpattern.proxy;

/**
 * @Author: oubin
 * @Date: 2020/9/23 11:27
 * @Description:
 */
public class ProxySubject implements ISubject {

    private ISubject iSubject;

    public ProxySubject(ISubject iSubject) {
        this.iSubject = iSubject;
    }

    @Override
    public void sleep() {
        System.out.println("冬天到了");
        iSubject.sleep();
    }
}
