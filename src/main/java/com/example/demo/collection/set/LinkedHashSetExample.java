package com.example.demo.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        Iterator<String> i=linkedHashSet.iterator();
        System.out.println("LinkedHashSet " + linkedHashSet);

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        System.out.println("HashSet " + hashSet);
    }
}
