package com.example.demo.collection.sort;

import com.example.demo.collection.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lemon");
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        Collections.sort(arrayList, Comparator.comparing(String::valueOf));
        arrayList.stream().forEach(System.out::println);

        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("Viru"));
        al.add(new Student("Saurav"));
        al.add(new Student("Mukesh"));
        al.add(new Student("Tahir"));

        Collections.sort(al, new NameComparator());
//        Collections.sort(al);
        al.stream().forEach(System.out::println);
    }
}
