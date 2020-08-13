package com.ob.base.thread.review.b;

/**
 * @Author: oubin
 * @Date: 2020/8/11 12:40
 * @Description:
 */
public class RunnableA implements Runnable {

    private SharedClass sharedClass;

    public RunnableA(SharedClass sharedClass) {
        this.sharedClass = sharedClass;
    }

    @Override
    public void run() {
        sharedClass.aThread();
    }
}
