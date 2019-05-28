package com.ob.base.thread.bookdemo.b;

/**
 * @Author: oubin
 * @Date: 2019/5/28 14:28
 * @Description:
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.func("a");
    }
}
