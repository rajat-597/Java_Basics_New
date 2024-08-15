package com.oops.concepts.Composition.Order_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create some Item objects
        Item item1 = new Item("Laptop", 999.99);
        Item item2 = new Item("Mouse", 25.50);
        Item item3 = new Item("Keyboard", 75.00);
        // Step 2: Create a list of items
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        // Step 3: Create an Order object using the parameterized constructor
        Order order = new Order(itemList); // Passing the item list to the order constructor
        // Alternatively, you can add items individually after creating an empty order
        // Order order = new Order(); // Uncomment this to create an empty order
        // order.addItem(item1); // Add items to the order individually
        // order.addItem(item2);
        // order.addItem(item3);
        // Step 4: Display the order details
        order.checkParameterizedConstructValue();  // to check value is added to list using  List<Item> itemList = new ArrayList<>();

        order.displayOrder();
    }
}