package com.ob.base.thread.review.d;

/**
 * @Author: oubin
 * @Date: 2020/8/11 14:17
 * @Description:
 */
public class Consumer implements Runnable {

    private Repository repository;

    public Consumer(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        while (true) {
            repository.pop();
        }
    }
}
