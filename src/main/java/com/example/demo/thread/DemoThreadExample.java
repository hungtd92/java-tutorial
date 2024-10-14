package com.example.demo.thread;

public class DemoThreadExample {
    public static void main(String args[]){
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());

        t1.start();
        t2.start();

        t1.setName("Sonoo Jaiswal");
        System.out.println("After changing name of t1:"+t1.getName());
    }
}
