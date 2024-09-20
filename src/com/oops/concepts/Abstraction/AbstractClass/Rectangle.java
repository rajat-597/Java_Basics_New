package com.oops.concepts.Abstraction.AbstractClass;

// Rectangle.java
public class Rectangle extends TwoDimensionalShape {
    private double width;
    private double height;


    public Rectangle(double width, double height,int age, String name, int id) {
        super(age,name,id);
        this.width = width;
        this.height = height;
    }

    // Implementing the abstract method from Shape
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }

    // Implementing the abstract method from TwoDimensionalShape
    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of the rectangle: " + area);
    }
}

