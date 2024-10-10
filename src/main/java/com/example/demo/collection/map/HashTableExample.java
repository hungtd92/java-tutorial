package com.example.demo.collection.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String args[]) {
        Hashtable<Integer,String> map=new Hashtable<>();
        map.put(100,"Amit");
        map.put(102,"Ravi");
        map.put(101,"Vijay");
        map.put(103,"Rahul");
        System.out.println("Before remove: "+ map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("After remove: "+ map);

        Hashtable<Integer,String> map2 = (Hashtable<Integer, String>) map.clone();
        System.out.println("map2: " + map2);

        map.put(105, "Cris");
        System.out.println("map: " + map);
        System.out.println("map2: " + map2);


        map2.put(106, "Thomas");
        System.out.println("map: " + map);
        System.out.println("map2: " + map2);

        System.out.println("getOrDefault " + map.getOrDefault(109, null));


    }
}
