package com.oops.concepts.Composition.Order_Management_System_Approach2;

public class Main {
    public static void main(String[] args) {
        // Create items
        Item item1 = new Item("Laptop", 999.99);
        Item item2 = new Item("Mouse", 25.50);
        Item item3 = new Item("Keyboard", 75.00);

        // Create an order and add items to it
        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        // Create a customer with no initial orders
        Customer customer = new Customer("John Doe", "john.doe@example.com");

        // Place the order
        customer.placeOrder(order);

        // Print customer details and order total
        System.out.println(customer);  // Output: Customer(name='John Doe', email='john.doe@example.com', orders=[Order with 1100.49 total price. ])
        System.out.println("Total Price of Order: " + order.getTotalPrice());  // Output: Total Price of Order: 1100.49
    }
}

