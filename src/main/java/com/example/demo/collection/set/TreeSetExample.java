package com.example.demo.collection.set;

import com.example.demo.collection.Book;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSetExample = new TreeSet<>();
        treeSetExample.add("One");
        treeSetExample.add("Two");
        treeSetExample.add("Three");
        treeSetExample.add("Four");
        treeSetExample.add("Five");
        System.out.println("TreeSet " + treeSetExample);
        System.out.println("TreeSet descending " + treeSetExample.descendingSet());

        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        treeSetInteger.add(24);
        treeSetInteger.add(66);
        treeSetInteger.add(12);
        treeSetInteger.add(15);
        System.out.println("Lowest Value: " + treeSetInteger.pollFirst());
        System.out.println("Highest Value: " + treeSetInteger.pollLast());
        System.out.println("TreeSet Integer " + treeSetInteger);

        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        System.out.println("Initial Set: " + treeSet);
        System.out.println("Reverse Set: "+treeSet.descendingSet());

        System.out.println("Head Set: "+treeSet.headSet("C", true));

        System.out.println("SubSet: "+treeSet.subSet("A", false, "E", true));
        System.out.println("SubSet: "+treeSet.subSet("A", true, "E", false));

        System.out.println("TailSet: "+treeSet.tailSet("C", false));

        Set<Book> set=new TreeSet<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        //Adding Books to TreeSet
        set.add(b1);
        set.add(b2);
        set.add(b3);
        //Traversing TreeSet
        for(Book b:set){
            System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());
        }
    }
}
