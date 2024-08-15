package com.oops.concepts.Composition.Order_Management_System_Approach2;

import java.util.ArrayList;
        import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void placeOrder(Order order) {
        if (order != null) {
            orders.add(order);
        } else {
            throw new IllegalArgumentException("Order cannot be null.");
        }
    }

    @Override
    public String toString() {
        StringBuilder ordersSummary = new StringBuilder();
        for (Order order : orders) {
            ordersSummary.append("Order with ").append(order.getTotalPrice()).append(" total price. ");
        }
        return "Customer(name='" + name + "', email='" + email + "', orders=[" + ordersSummary + "])";
    }
}

