package com.oops.concepts.Casting;

public class Animal {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

 class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();  // child or subclass
        Animal animal = dog; // Upcasting (implicit)
        animal.makeSound(); // Output: Animal makes a sound

        // Explicit DownCasting (here we first create the instance of Dog class(sub/child)
        // and it's reference variable hold Animal class(super)

//        Animal animaal = new Dog(); // Upcasting
//        if(animaal instanceof Dog){
//            Dog dogg = (Dog) animaal ; // downCasting
//            dogg.bark();  // Dog barks
//        }

        Animal animal2 = new Animal();
        System.out.println("before animal2 is the instance of Dog Class");

        if(animal2 instanceof Dog){
            System.out.println("animal2 is the instance of Dog Class");
            Dog dogg2 = (Dog) animal2;
            dogg2.bark();  //  Throws ClassCastException (as here we have created the instance of Animal class
            // itself and  it's reference variable hold Animal class(super)
        }


    }
}