package com.example.demo.clone;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String name;
    private Address addr;

    public User(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}
