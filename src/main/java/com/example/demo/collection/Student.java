package com.example.demo.collection;

public class Student implements Comparable<Student> {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }
}
