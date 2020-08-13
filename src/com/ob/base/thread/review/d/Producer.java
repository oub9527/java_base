package com.ob.base.thread.review.d;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:17
 * @Description:
 */
public class Producer implements Runnable {

    private Repository repository;

    public Producer(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        while (true) {
            repository.push();
        }
    }
}
