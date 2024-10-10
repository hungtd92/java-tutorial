package com.example.demo.thread;

public class ThreadPriorityExample extends Thread {

    public void run() {
        // the print statement
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) {
        ThreadPriorityExample th1 = new ThreadPriorityExample();
        ThreadPriorityExample th2 = new ThreadPriorityExample();
        ThreadPriorityExample th3 = new ThreadPriorityExample();

        System.out.println("Priority of the thread th1 is: " + th1.getPriority());
        System.out.println("Priority of the thread th2 is: " + th2.getPriority());
        System.out.println("Priority of the thread th3 is: " + th3.getPriority());

        th1.setPriority(6);
        th2.setPriority(7);
        th3.setPriority(8);

        System.out.println("Priority of the thread th1 is: " + th1.getPriority());
        System.out.println("Priority of the thread th2 is: " + th2.getPriority());
        System.out.println("Priority of the thread th3 is: " + th3.getPriority());

        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }

}
