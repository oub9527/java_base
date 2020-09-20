package com.ob.base.thread.ali.e;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: oubin
 * @Date: 2020/9/15 23:36
 * @Description: A方法需要调用N次B方法，B方法会返回成功与否，请用最快的方式获取成功的次数，AB方法，参数都是给的现成的，所以可以当做这个题来做
 * （题目给了参数，实际是考察线程池的使用）
 */
public class AInvokeB {

    public static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
            3,
            3,
            1,
            TimeUnit.MINUTES,
            new LinkedBlockingDeque<>(),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    public static void main(String[] args) {

        doAFunc(10);

    }

    public static void doAFunc(int n) {
        List<Future<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Future<Integer> submit = threadPoolExecutor.submit(AInvokeB::doBFunc);
            list.add(submit);
        }
        int count = 0;
        for (Future<Integer> future : list) {
            try {
                count += future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("success : " + count);
        threadPoolExecutor.shutdown();


    }

    public static int doBFunc() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1");
        return (int) (System.currentTimeMillis() % 2);
    }
}
