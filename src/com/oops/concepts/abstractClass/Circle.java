package com.oops.concepts.abstractClass;

public class Circle extends Shape{

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    void draw() {
        System.out.println("Draw the circle");
    }

    @Override
    double area() {
        return 3.14*r*r;
    }
}
