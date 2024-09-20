package com.oops.concepts.Abstraction.AbstractClass;

// TwoDimensionalShape.java
public abstract class TwoDimensionalShape extends Shape {
    // Abstract method to be implemented by subclasses


    public TwoDimensionalShape(int age, String name, int id) {
        super(age, name, id);
    }

    public abstract void calculateArea();
}

