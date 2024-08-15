package com.oops.concepts.Composition.Building_Complex_Objects;

public class Transmission {

    private String type; // Manual, Automatic (gear)

    public Transmission(String type) {
        this.type = type;
    }

    public void shiftGear(){
        System.out.println(type + " transmission shifting");
    }
}
