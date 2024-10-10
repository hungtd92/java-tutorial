package com.example.demo.thread;

public class ThreadPriorityExample1 extends Thread {
    public void run() {
        System.out.println("Inside the run() method");
    }
    public static void main(String argvs[])
    {

        Thread.currentThread().setPriority(7);

        // displaying the main thread priority
        // using the getPriority() method of the Thread class
        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        // creating a thread by creating an object of the class ThreadPriorityExample1
        ThreadPriorityExample1 th1 = new ThreadPriorityExample1();

        // th1 thread is the child of the main thread
        // therefore, the th1 thread also gets the priority 7

        // Displaying the priority of the current thread
        System.out.println("Priority of the thread th1 is : " + th1.getPriority());

        Thread thread1 = new Thread(() -> {
            System.out.println("lambda syntax");
        });
        thread1.start();
    }
}
