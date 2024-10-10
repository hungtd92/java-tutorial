package com.example.demo.staticdemo;

public class CounterWithStatic {

    private static int count = 0;

    public CounterWithStatic() { }

    public void visit() {
        count++;
        System.out.println("count = " + count);
    }

}
