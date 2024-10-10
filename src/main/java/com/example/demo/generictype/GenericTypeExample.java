package com.example.demo.generictype;

import com.example.demo.staticdemo.CounterWithStatic;
import com.example.demo.staticdemo.CounterWithoutStatic;
import com.example.demo.staticdemo.UsingStaticMethod;

public class GenericTypeExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        PhoneName phone = new PhoneName(123456, "One");

        System.out.println("Key " + phone.getKey());
        System.out.println("Value " + phone.getValue());

        StringAndValueEntry<Integer> stringAndValue = new StringAndValueEntry("One", 1234);

        System.out.println("Key " + stringAndValue.getKey());
        System.out.println("Value " + stringAndValue.getValue());

        MyGeneric<Bar> myGeneric = new MyGeneric<>(Bar.class);

        Bar bar = myGeneric.getTobject();

        bar.currentDate();
    }
}
