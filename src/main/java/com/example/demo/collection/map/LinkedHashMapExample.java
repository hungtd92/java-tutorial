package com.example.demo.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        System.out.println("HashMap ----------------");
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(5,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        map.put(2, "Lemon");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(map);

        System.out.println("LinkedHashMap ----------------");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1,"Mango");  //Put elements in Map
        lhm.put(5,"Apple");
        lhm.put(3,"Banana");
        lhm.put(4,"Grapes");
        lhm.put(2, "Lemon");
        for (Map.Entry m : lhm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(lhm);
        //Fetching key
        System.out.println("Keys: "+lhm.keySet());
        //Fetching value
        System.out.println("Values: "+lhm.values());
        //Fetching key-value pair
        System.out.println("Key-Value pairs: "+lhm.entrySet());


    }
}
