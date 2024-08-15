package com.oops.concepts.Composition.Building_Complex_Objects;

public class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public  void rotate(){
        System.out.println("Wheel of size " + size + " is rotating");
    }
}
