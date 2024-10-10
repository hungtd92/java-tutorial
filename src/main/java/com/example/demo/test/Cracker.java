package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component
public class Cracker {
  public void startCracking() {
    System.out.println("Cracking...");
  }

  public void stopCracking() {
    System.out.println("Cracking Stopped!");
  }

}
