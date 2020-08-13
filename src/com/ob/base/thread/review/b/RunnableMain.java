package com.ob.base.thread.review.b;


/**
 * @Author: oubin
 * @Date: 2020/8/11 12:46
 * @Description:
 */
public class RunnableMain {

    public static void main(String[] args) {
        SharedClass sharedClass = new SharedClass();

        RunnableA runnableA = new RunnableA(sharedClass);

        RunnableB runnableB = new RunnableB(sharedClass);

        Thread thread1 = new Thread(runnableA);

        Thread thread2 = new Thread(runnableB);

        thread1.start();

        thread2.start();


    }
}
