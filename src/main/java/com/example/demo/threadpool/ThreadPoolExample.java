package com.example.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    static final int MAX_TH = 3;

    public static void main(String[] args) {
        Runnable rb1 = new Tasks("task 1");
        Runnable rb2 = new Tasks("task 2");
        Runnable rb3 = new Tasks("task 3");
        Runnable rb4 = new Tasks("task 4");
        Runnable rb5 = new Tasks("task 5");

        // creating a thread pool with MAX_TH number of
        // threads size the pool size is fixed
        ExecutorService pl = Executors.newFixedThreadPool(MAX_TH);

        // passes the Task objects to the pool to execute (Step 3)
        pl.execute(rb1);
        pl.execute(rb2);
        pl.execute(rb3);
        pl.execute(rb4);
        pl.execute(rb5);

        // pool is shutdown
        pl.shutdown();
    }
}
