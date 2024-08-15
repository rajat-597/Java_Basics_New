package com.oops.concepts.Composition.Building_Complex_Objects;

public class Main {
    public static void main(String[] args) {
    //    Engine engine = new Engine("Audi A6");
     //   Transmission transmission = new Transmission("Automatic");
        // The Arrays.asList() method is used to convert an array of objects into a List. Here,
        // it takes a variable number of Wheel objects and creates a List<Wheel> containing these objects.
//        List<Wheel> wheels = Arrays.asList(
//                new Wheel(15),
//                new Wheel(15),
//                new Wheel(15),
//                new Wheel(15)
//
//        );

        // if we are using array instead of list then
        // Declare and initialize the Wheel array
//        Wheel[] wheels = new Wheel[] {
//                new Wheel("Front Left"),
//                new Wheel("Front Right"),
//                new Wheel("Rear Left"),
//                new Wheel("Rear Right")
//        };
//
//        Car car = new Car(engine, transmission, wheels);
//        car.start();
//        car.stop();

        // second approach

       Car car = new Car("BMW I7", 10, "Automatic");
       car.start();
       car.stop();
    }
}
