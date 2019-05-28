package com.ob.base.thread.bookdemo.b;

/**
 * @Author: oubin
 * @Date: 2019/5/28 14:24
 * @Description:
 */
public class HasSelfPrivateNum {

    /**
     * 如果是实例变量，会存在线程不安全的问题
     */
    private int num;

    public void func(String str) {
        //方法内的变量不会有线程安全问题
//        int num = 0;
        if ("a".equals(str)) {
            num = 100;
            System.out.println("a num = " + num);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            num = 200;
            System.out.println("b num = " + num);
        }

        System.out.println(str + " last num = " + num);
    }
}
