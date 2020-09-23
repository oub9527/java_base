package com.ob.base.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: oubin
 * @Date: 2020/9/23 10:53
 * @Description:
 */
public class WechatObserver implements Observer {

    private List<Subject> subjects;

    public WechatObserver() {
        subjects = new ArrayList<>();
    }


    @Override
    public void register(Subject subject) {
        subjects.add(subject);

    }

    @Override
    public void update() {
        for (Subject subject : subjects) {
            subject.notified();
        }
    }
}
