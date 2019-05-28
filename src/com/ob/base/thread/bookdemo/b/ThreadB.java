package com.ob.base.thread.bookdemo.b;

/**
 * @Author: oubin
 * @Date: 2019/5/28 14:29
 * @Description:
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.func("b");
    }
}
