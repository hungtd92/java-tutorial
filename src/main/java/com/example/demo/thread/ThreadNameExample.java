package com.example.demo.thread;

class ThreadName extends Thread {
    ThreadName(String threadName) {
        super(threadName);
    }

    public void run() {
        System.out.println("The thread is executing....");
    }
}

public class ThreadNameExample {

    public static void main (String args[]) {
        // creating two threads and settting their name
        // using the contructor of the class
        ThreadName th1 = new ThreadName("JavaTpoint1");
        ThreadName th2 = new ThreadName("JavaTpoint2");

        // invoking the getName() method to get the names
        // of the thread created above
        System.out.println("Thread - 1: " + th1.getName());
        System.out.println("Thread - 2: " + th2.getName());


        // invoking the start() method on both the threads
        th1.start();
        th2.start();
    }
}
