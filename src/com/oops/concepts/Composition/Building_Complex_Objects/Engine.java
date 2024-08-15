package com.oops.concepts.Composition.Building_Complex_Objects;

public class Engine {

    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start(){
        System.out.println(type + " Engine  starting");
    }

    public void stop(){
        System.out.println(type + " Engine stops");
    }
}
