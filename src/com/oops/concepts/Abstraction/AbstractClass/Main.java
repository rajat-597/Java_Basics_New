package com.oops.concepts.Abstraction.AbstractClass;

// Main.java
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10, 28,"Rajat", 101);

        // Calling methods from the Shape class
        rectangle.describe(); // Inherited from Shape

        // Calling methods implemented in Rectangle
        rectangle.draw(); // Implemented in Rectangle
        rectangle.calculateArea(); // Implemented in Rectangle
        rectangle.name = "Rajat";
        TwoDimensionalShape tds = new Rectangle(8, 12, 29,"Roshan", 102);
        System.out.println(tds.name);
    }
}

