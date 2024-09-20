package com.oops.concepts.Abstraction.AbstractClass;

// Shape.java
public abstract class Shape {
    // we can use all the access modifier as well as static for variables
    private int age;
    public static String companyName;

    String name;
    protected int id;

    public Shape(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    // Abstract method to be implemented by subclasses
    public abstract void draw();

    // Concrete method that can be inherited by subclasses
    public void describe() {
        System.out.println("This is a shape.");
    }
}

