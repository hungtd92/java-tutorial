package com.example.demo.collection.map;

import java.util.*;

public class MapExample {
    public static void main(String args[]){
        Map map1 = new HashMap();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        map1.put(4, "D");

        Set set = map1.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Elements can traverse in any order
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
