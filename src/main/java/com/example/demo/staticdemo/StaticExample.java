package com.example.demo.staticdemo;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class StaticExample {
    public static void main(String[] args) {
        CounterWithoutStatic counterWithoutStatic1 = new CounterWithoutStatic();
        counterWithoutStatic1.visit();
        CounterWithoutStatic counterWithoutStatic2 = new CounterWithoutStatic();
        counterWithoutStatic2.visit();


        CounterWithStatic counterWithStatic1 = new CounterWithStatic();
        counterWithStatic1.visit();
        CounterWithStatic counterWithStatic2 = new CounterWithStatic();
        counterWithStatic2.visit();

        // Demo static method
        UsingStaticMethod demo1 = new UsingStaticMethod("Core Java");
        demo1.changePrint("admin.net");
    }
}
