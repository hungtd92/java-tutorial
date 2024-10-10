package com.example.demo.collection.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Vector<String> vec = new Vector<String>(4);
        //Adding elements to a vector
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        //Check size and capacity
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity is: "+vec.capacity());
        //Display Vector elements
        System.out.println("Vector element is: "+vec);
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        //Again check size and capacity after two insertions
        System.out.println("Size after addition: "+vec.size());
        System.out.println("Capacity after addition is: "+vec.capacity());
        //Display Vector elements again
        System.out.println("Elements are: "+vec);
        //Checking if Tiger is present or not in this vector
        if(vec.contains("Tiger"))
        {
            System.out.println("Tiger is present at the index " +vec.indexOf("Tiger"));
        }
        else
        {
            System.out.println("Tiger is not present in the list.");
        }
        //Get the first element
        System.out.println("The first animal of the vector is = "+vec.firstElement());
        //Get the last element
        System.out.println("The last animal of the vector is = "+vec.lastElement());
    }
}
