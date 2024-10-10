package com.example.demo.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }

        Deque<String> deque2=new ArrayDeque<String>();
        deque2.offer("arvind");
        deque2.offer("vimal");
        deque2.add("mukul");
        deque2.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for(String s:deque2) {
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque2) {
            System.out.println(s);
        }
    }
}
