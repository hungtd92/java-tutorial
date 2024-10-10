package com.example.demo.throwsdemo;

public class TestThrow {
    public static void checkNum(int num) {
        try {
            if (num < 1) {
                throw new ArithmeticException("Number is negative, cannot calculate square");
            }
            else {
                System.out.println("Square of " + num + " is " + (num*num));
            }
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    //main method
    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.checkNum(-3);
        System.out.println("Rest of the code..");
    }
}
