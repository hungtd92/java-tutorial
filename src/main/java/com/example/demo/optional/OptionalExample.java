package com.example.demo.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[1] = "test";
        Optional<String> optionalVal = Optional.ofNullable(arr[1]);
        if (optionalVal.isPresent()) {
            String uppercase = arr[1].toUpperCase();
            System.out.println(uppercase);
        } else {
            System.out.println("Null value");
        }
    }
}
