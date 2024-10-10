package com.example.demo.collection.set;

import com.example.demo.collection.Book;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Gavi");
        hashSet.add("Pedri");
        hashSet.add("De Jong");

        Iterator i = hashSet.iterator();
        System.out.println("-- before add duplicate element " + hashSet);
        System.out.println("---------------------------------");

        hashSet.add("Lewi");
        hashSet.add("Messi");
        hashSet.add("De Jong");
        hashSet.add("De jong");
        System.out.println("-- after add duplicate element " + hashSet);
        System.out.println("---------------------------------");

        // Remove & addAll
        hashSet.remove("De jong");
        System.out.println("-- after remove element 'De jong' " + hashSet);
        System.out.println("---------------------------------");

        java.util.HashSet<String> hashSet1 = new java.util.HashSet<>();
        hashSet1.add("Yamal");
        hashSet1.add("Olmo");
        hashSet1.add("Fermin");
        hashSet1.addAll(hashSet);

        HashSet<String> hashSet2 = (HashSet) hashSet.clone();

        System.out.println("-- after invoking clone to hashSet2 " + hashSet2);
        System.out.println("---------------------------------");

        hashSet.clear();
        System.out.println("-- after clear set hashSet " + hashSet);
        System.out.println("---------------------------------");

        System.out.println("-- after add element & addAll methods into hashSet1 " + hashSet1);
        System.out.println("---------------------------------");

        hashSet1.removeAll(hashSet2);
        System.out.println("-- after invoking removeAll method hashSet2 " + hashSet1);
        System.out.println("---------------------------------");


        hashSet1.removeIf(s -> s.contains("Ol"));
        System.out.println("-- after invoking removeIf method " + hashSet1);
        System.out.println("---------------------------------");


        hashSet1.clear();
        System.out.println("-- after invoking clear method " + hashSet1);
        System.out.println("---------------------------------");

        Book b1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);
        HashSet<Book> hashSet3 = new HashSet<>();
        hashSet3.add(b1);
        hashSet3.add(b2);
        hashSet3.add(b3);
        System.out.println("hashSet3 " + hashSet3);
    }
}
