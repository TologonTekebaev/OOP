package com.company;

public class Person {
    String name;
    String lastName;
    byte age;
    double height;
    double weight;
    String gender;
    String color;
    String nationality;
    String status;
    boolean education;

    public void run(){
        System.out.println(this.name + " is running");
    }
    public void say(){
        System.out.println(name + lastName +  " is speaking");
    }
}
