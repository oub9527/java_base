package com.ob.base.thread.orderprint;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: oubin
 * @Date: 2019/5/27 10:00
 * @Description:
 */
public class ThreadA extends Thread{

    private List<Character> characters = Arrays.asList('e','g','k','n','o');
    private List<Integer> indexChar = Arrays.asList(4, 6, 10, 13, 14);

    private final CharObject charObject;

    public ThreadA(CharObject charObject) {
        this.charObject = charObject;
    }

    @Override
    public void run() {
        while (charObject.getIndex() < 26) {
            synchronized (charObject) {
                charObject.notify();
                if (indexChar.contains(charObject.getIndex())) {
                    charObject.print();
                    try {
                        charObject.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

    }
}
