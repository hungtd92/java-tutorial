package com.example.demo.collection.list;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String [] args)
    {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");
        ll.add("Anuj");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Virat");
        ll.add("Gaurav");
        ll.add("Harsh");
        ll.add("Amit");
        System.out.println("Initial list of elements: "+ll);
        //Removing specific element from arraylist
        ll.remove("Vijay");
        System.out.println("After invoking remove(object) method: "+ll);
        //Removing element on the basis of specific position
        ll.remove(0);
        System.out.println("After invoking remove(index) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("Ravi");
        ll2.add("Hanumat");
        // Adding new elements to arraylist
        ll.addAll(ll2);
        System.out.println("Updated list : "+ll);
        //Removing all the new elements from arraylist
        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ll);
        //Removing first element from the list
        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll);
        //Removing first element from the list
        ll.removeLast();
        System.out.println("After invoking removeLast() method: "+ll);
        //Removing first occurrence of element from the list
        ll.removeFirstOccurrence("Gaurav");
        System.out.println("After invoking removeFirstOccurrence() method: "+ll);
        //Removing last occurrence of element from the list
        ll.removeLastOccurrence("Harsh");
        System.out.println("After invoking removeLastOccurrence() method: "+ll);

        //Removing all the elements available in the list
        ll.clear();
        System.out.println("After invoking clear() method: "+ll);



        LinkedList<Integer> ll5=new LinkedList<Integer>();
        ll5.add(1);
        ll5.add(2);
        ll5.add(3);
        System.out.println("ll5 original: " + ll5);

        ll5.remove(1);
        System.out.println("ll5 remove index: " + ll5);

        ll5.remove(1);
        System.out.println("ll5 remove object: " + ll5);
    }
}
