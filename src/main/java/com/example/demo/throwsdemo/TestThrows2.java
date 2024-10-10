package com.example.demo.throwsdemo;

import java.io.*;

class M2 {

    void method() throws IOException {
        System.out.println("device operation performed");
    }
}

class TestThrows2 {

    public static void main(String args[]) throws IOException {//declare exception
        M2 m = new M2();
        m.method();

        System.out.println("normal flow...");
    }
}
