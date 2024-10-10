package com.example.demo.recursion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FibonacciTest {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(FibonacciTest.class, args);

    System.out.println("Fibo: " + fibo(2));
    System.out.println("Fibo: " + fibo(3));
    System.out.println("Fibo: " + fibo(4));

    String input = "hung.tong@bic.tech";
    String[] arrays = input.split(",");
    System.out.println(arrays);
  }

  public static int fibo(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibo(n -1) + fibo(n - 2);
  }


}
