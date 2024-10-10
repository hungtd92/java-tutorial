package com.example.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String args[]) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> map1=new HashMap<Integer,String>();//Creating HashMap
        map1.put(1,"Mango");  //Put elements in Map
        map1.put(2,"Apple");
        map1.put(3,"Banana");
        map1.put(1,"Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map1.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"Mango");
        hm.put(2,"Apple");
        hm.put(3,"Banana");
        hm.put(4,"Orange");
        System.out.println("After invoking put() method ");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("After invoking putIfAbsent() method ");
        hm.putIfAbsent(5,"Kiwi");
        hm.putIfAbsent(3,"Lemon");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        System.out.println("After invoking remove(key) method ");
        hm.putIfAbsent(6,"Lemon");
        hm.remove(3);
        printHashMap(hm);
        System.out.println("After invoking remove(key, value) method ");
        hm.remove(6, "Banana");
        printHashMap(hm);

        System.out.println("After invoking replace(key, value) method ");
        hm.putIfAbsent(6,"Lemon");
        hm.replace(6,"Avocado");
        hm.replace(7,"Durian");
        printHashMap(hm);

        System.out.println("After invoking replace(key, oldValue, newValue) method ");
        hm.replace(6,"Avocado", "Durian");
        hm.replace(5,"Kiwi", "Peach");
        printHashMap(hm);

        System.out.println("After invoking compute() method ");
        hm.compute(5,(key, val) -> val.concat(" new"));
        printHashMap(hm);

        System.out.println("After invoking compute() method ");
        hm.computeIfPresent(7,(key, val) -> val.concat(" new"));
        printHashMap(hm);

        System.out.println("After invoking compute() method ");
        hm.computeIfAbsent(8, k -> "new ");
        printHashMap(hm);


        System.out.println("HashMap A");
        printHashMap(hm);

        HashMap<Integer, String> hm2 = (HashMap) hm.clone();
        System.out.println("HashMap B is cloned from A");
        printHashMap(hm2);

        System.out.println("HashMap B after HashMap A put element");
        hm.put(3, "Melon");
        printHashMap(hm);
        printHashMap(hm2);

        System.out.println("HashMap A after HashMap B put element");
        hm2.put(8, "Melon");
        printHashMap(hm);
        printHashMap(hm2);
    }

    static void printHashMap(HashMap<Integer, String> hm) {
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
        System.out.println("--------------------------------");
    }
}
