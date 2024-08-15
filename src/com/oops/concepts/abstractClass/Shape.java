package com.oops.concepts.abstractClass;

public abstract class Shape {

    abstract void draw();
    abstract double area();

   //  static abstract m1();  not possible to create static abstract method

    public void perimeter(){
        System.out.println("Perimeter ");
    }
}
