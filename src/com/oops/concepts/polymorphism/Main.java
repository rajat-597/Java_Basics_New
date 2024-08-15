package com.oops.concepts.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Reference of Animal type but pointing to Dog object
        Animal myAnimal = new Dog();
        myAnimal.makeSound();  // Outputs: Dog barks

        // Reference of Animal type but pointing to Cat object
        myAnimal = new Cat();
        myAnimal.makeSound();  // Outputs: Cat meows
    }
}
