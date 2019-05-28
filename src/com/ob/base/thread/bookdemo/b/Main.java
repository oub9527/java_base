package com.ob.base.thread.bookdemo.b;

/**
 * @Author: oubin
 * @Date: 2019/5/28 14:30
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadA.start();
        threadB.start();
    }
}
