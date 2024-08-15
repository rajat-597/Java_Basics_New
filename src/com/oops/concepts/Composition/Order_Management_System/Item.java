package com.oops.concepts.Composition.Order_Management_System;

public class Item {
    private String name;
    private double price;
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    double getPrice() {
        return price;
    }
    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}