package com.example.demo.string;

import java.util.Date;

public class StringExample {

    public static void main(String[] args) {
        int n = 1000000;
        System.out.println("Time taken StringConcatenation with '+' operator: " + StringConcatenation(n));

//        System.out.println("Time taken StringConcatenationWithStringBuilder: " + StringConcatenationWithStringBuilder(n));
    }

    static long StringConcatenation(int n) {
        long start = System.nanoTime();
        String result = "";

        for (int i = 1; i <= n; i++) {
            result = result + " test";
        }

        long end = System.nanoTime();

        return end - start;
    }

    static long StringConcatenationWithStringBuilder(int n) {
        long start = System.nanoTime();
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append(" test");
        }

        long end = System.nanoTime();

        return end - start;
    }
}
