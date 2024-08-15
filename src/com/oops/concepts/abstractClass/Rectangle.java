package com.oops.concepts.abstractClass;

public class Rectangle extends Shape{

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    double area() {
        System.out.println("inside Rectangle class");
        return length*breadth;
    }
}
