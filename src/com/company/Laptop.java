package com.company;

public class Laptop {
    String name;
    String screenSize;
    int god;
    String processor;
    double weight;
    String color;
    double price;

    public void open (){
        System.out.println(name + " switched on");
    }
    public  void closed (){
        System.out.println(name + " disabled");
    }
}
