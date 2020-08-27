package com.ob.base.thread.ali.d;

/**
 * @Author: oubin
 * @Date: 2020/8/12 20:06
 * @Description:
 * 题目1:
 * 每隔一秒打印一次日志，共16秒打印完。现在我想要在4秒打印完。
 */
public class Object {

    public static void main(String[] args) {

        try {
            for (int i = 0; i < 16; i++) { // 此行不能动
                final String log = "" + (i + 1);  // 此行不能动
                parseLog(log);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void parseLog(String log) throws InterruptedException {
        System.out.println(log + ":" + System.currentTimeMillis() / 1000);
        Thread.sleep(1000);
    }
}
