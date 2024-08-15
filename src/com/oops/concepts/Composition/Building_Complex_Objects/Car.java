package com.oops.concepts.Composition.Building_Complex_Objects;

public class Car {

    private Engine engine;
    private Transmission transmission;
  //  private List<Wheel> wheels; // we have list as we have four wheels for car.
    private Wheel[] wheels;

//    public Car(Engine engine, Transmission transmission, List<Wheel> wheels) {
//        this.engine = engine;
//        this.transmission = transmission;
//        this.wheels = wheels;
//        // initialization of objects is needed else it will give null pointer exception
//    }

    // we can directly initialize as well
    Car(String engineType, int wheelSize, String transmissionType) {
        this.engine = new Engine(engineType);
        this.wheels = new Wheel[] { new Wheel(wheelSize), new Wheel(wheelSize), new Wheel(wheelSize), new Wheel(wheelSize) };
        this.transmission = new Transmission(transmissionType);
    }

    public void start(){
        engine.start();
        transmission.shiftGear();
         for (Wheel wheel : wheels){
             wheel.rotate();
         }
        System.out.println();
    }

    public void stop(){
        engine.stop();
        System.out.println("car is stopped");
    }
}
