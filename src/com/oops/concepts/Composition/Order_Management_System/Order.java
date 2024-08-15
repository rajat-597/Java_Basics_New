package com.oops.concepts.Composition.Order_Management_System;

import java.util.ArrayList;
import java.util.List;
class Order {

    private List<Item> items;
    // Default constructor
    Order() {
        items = new ArrayList<>();
    }
    // Parameterized constructor
    Order(List<Item> items) {
        // this.items = items; // same as below
        this.items = new ArrayList<>(items); // Create a copy of the provided list
    }
    public void checkParameterizedConstructValue(){
        for(Item item :items){
            System.out.println(item.toString());
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                '}';
    }

    void addItem(Item item) {
        items.add(item); // Adding an item to the list of items in the order
    }
    double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice(); // Summing up the prices of all items
        }
        return total;
    }
    void displayOrder() {
        System.out.println("Order Details:");
        for (Item item : items) {
            System.out.println("- " + item.getName() + ": $" + item.getPrice());
        }
        System.out.printf("Total: $%.2f%n", calculateTotal()); // Displaying total cost
    }
}