package com.example.demo.staticdemo;

public class UsingStaticMethod {

    private String subject;

    public UsingStaticMethod(String subject) {
        this.subject = subject;
    }

    public void print(){
        System.out.println("Subject: " + subject);
        System.out.println("Website: " + MyWebsite.WEBSITE);
    }

    public static void changeWebsite(String website) {
        MyWebsite.WEBSITE = website;
    }

    public void changePrint(String website) {
        changeWebsite(website);
        print();
    }
}
