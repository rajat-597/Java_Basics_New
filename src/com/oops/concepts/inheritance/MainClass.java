package com.oops.concepts.inheritance;

public class MainClass {

    public static void main(String[] args) {

        Bicycle originalCycle = new Bicycle(3,20);
        originalCycle.speedUp(5);
        System.out.println(originalCycle.toString());


        Bicycle duplicateCycle = new Bicycle(originalCycle);
        System.out.println(duplicateCycle.toString());

        MountainBike originalBike = new MountainBike(4,50,4);
        System.out.println(originalBike.toString());

        MountainBike duplicateBike = new MountainBike(originalBike);
        System.out.println(duplicateBike.toString());

        Bicycle bicycle = new MountainBike(5, 60, 5);
        bicycle.applyBrake(30);

    //     MountainBike bike = new Bicycle(); this is not possible as there are few attributes which are
        // there in child class but not in parent class. so we cannot initialize the child class value as we are
        // creating objects with parent class

    }
}
