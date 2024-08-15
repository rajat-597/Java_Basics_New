package com.oops.concepts.Composition.Order_Management_System_Approach2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            items.add(item);
        } else {
            throw new IllegalArgumentException("Item cannot be null.");
        }
    }

    public void removeItem(Item item) {
        if (items.contains(item)) {
            items.remove(item);
        } else {
            throw new IllegalArgumentException("Item not found in the order.");
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order(items=" + items + ")";
    }
}
