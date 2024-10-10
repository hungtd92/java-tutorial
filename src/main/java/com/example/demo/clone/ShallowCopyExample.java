package com.example.demo.clone;

public class ShallowCopyExample {
    public static void main(String[] args) {
        User user1 = new User(1, "Nguyen Van A", new Address("HCM", "VN"));
        User user2 = user1;

        System.out.println("user1" + user1);
        System.out.println("user2" + user2);

        user1.setId(2);
        System.out.println("user1" + user1);
        System.out.println("user2" + user2);


        user2.setId(4);
        System.out.println("user1" + user1);
        System.out.println("user2" + user2);
    }
}
