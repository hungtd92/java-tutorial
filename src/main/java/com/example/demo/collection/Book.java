package com.example.demo.collection;

import lombok.Getter;

@Getter
public class Book implements Comparable<Book> {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Book book) {
        if(id > book.id) {
            return 1;
        } else if(id < book.id) {
            return -1;
        } else {
            return 0;
        }
    }
}
