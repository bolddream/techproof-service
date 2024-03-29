package com.mancheng.techproof.com.mancheng.techproof.threadpooltech;

import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class ExecutorServiceDemo {
    public void startThreadPool() {
        // 创建一个线程池对象，控制要创建几个线程对象。
        // public static ExecutorService newFixedThreadPool(int nThreads)
        ExecutorService pool = Executors.newFixedThreadPool(2);

        // 可以执行Runnable对象或者Callable对象代表的线程
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        //结束线程池
        pool.shutdown();
    }

    public void startSingleThreadPool() {
        // 创建一个线程池对象，控制要创建几个线程对象。
        // public static ExecutorService newFixedThreadPool(int nThreads)
        ExecutorService pool = Executors.newSingleThreadExecutor();

        // 可以执行Runnable对象或者Callable对象代表的线程
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

        pool.execute(new MyRunnable());

        //结束线程池
        pool.shutdown();
    }
}
