package com.example.demo.testvc;

public class GoldenRetriever extends Dog {
    public void makenoise() {
        super.makenoise();
        System.out.println("Make Golden Retriever Noise");
    }

    public static void main(String[] args) throws Exception {
        Dog dog = new GoldenRetriever();
        dog.makenoise();

    }
}
