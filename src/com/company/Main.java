package com.company;

public class Main {

    public static void main(String[] args) {

        Laptop lenovo = new Laptop();
        lenovo.name = "IdeaPad 312";
        lenovo.color = "black";
        lenovo.god = 2016;
        lenovo.screenSize = "HD and 1800";
        lenovo.price = 40000;
        lenovo.weight = 3.3;
        lenovo.processor = "Intel Core i7";

        Laptop macos = new Laptop();
        macos.name = "Air 2021";
        macos.color = "white";
        macos.god = 2019;
        macos.screenSize = "HD and 1800";
        macos.price = 120000;
        macos.weight = 2.3;
        macos.processor = "M1";

        Laptop acer = new Laptop();
        acer.name = "Acer 23 Global";
        acer.color = "blue";
        acer.god = 2021;
        acer.screenSize = "HD";
        acer.price = 80000;
        acer.weight = 3.1;
        acer.processor = "Intel core i5";

        Laptop dell = new Laptop();
        dell.name = "Dell 23";
        dell.color = "black";
        dell.god = 2017;
        dell.screenSize = "HD and 1800";
        dell.price = 32600;
        dell.weight = 4.7;
        dell.processor = "Ryzen";

        Laptop lenovo1 = new Laptop();
        lenovo1.name = "Lenovo 292";
        lenovo1.color = "pink";
        lenovo1.god = 2021;
        lenovo1.screenSize = "HD and 1800";
        lenovo1.price = 86600;
        lenovo1.weight = 5.1;
        lenovo1.processor = "Intel core i3";

        lenovo.open();
        lenovo.closed();

        macos.open();
        macos.closed();

        acer.open();
        acer.closed();

        dell.open();
        dell.closed();

        lenovo1.open();
        lenovo.closed();
    }
}
