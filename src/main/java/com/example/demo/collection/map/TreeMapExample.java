package com.example.demo.collection.map;

import com.example.demo.collection.Book;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String args[]) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");

        System.out.println("Before invoking remove() method");
        System.out.println(map.entrySet());
        System.out.println("After invoking remove() method");
        map.remove(102);
        System.out.println(map.entrySet());

        map.put(102, "Ravi");
        System.out.println("descendingMap: " + map.descendingMap());
        System.out.println("headMap inclusive true " + map.headMap(103, true));
        System.out.println("headMap inclusive false " + map.headMap(103, false));
        System.out.println("tailMap inclusive true " + map.tailMap(101, true));
        System.out.println("tailMap inclusive false " + map.tailMap(101, false));
        System.out.println("subMap " + map.subMap(100, false, 102, false));

        Map<Integer, Book> treeMap = new TreeMap<Integer,Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to map
        treeMap.put(2,b1);
        treeMap.put(1,b2);
        treeMap.put(3,b3);

        //Traversing map
        for(Map.Entry<Integer, Book> entry:treeMap.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());
        }
    }
}
