package com.oops.concepts.abstractClass;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println(circle.area());

        Shape shape = new Rectangle(4,5);
        double res = shape.area();
        System.out.println(res);
    }
}
