package com.oops.concepts.inheritance;

public class MountainBike extends Bicycle {

    public int seatHeight;

    // Default constructor
    public MountainBike(){
        super();
        this.seatHeight = 1;
    }

    // parameterized constructor
    public MountainBike(int gear, int speed, int seatHeight) {
       // super(gear, speed);

        this.seatHeight = seatHeight;
    }

    // copy constructor
    public MountainBike(MountainBike old){
        super(old);
        this.seatHeight = old.seatHeight;
    }

    public void setSeatHeight(int h){
        this.seatHeight = h;
    }

    public String toString(){
        return (super.toString() + "\n" + "seatHeight " + seatHeight);
    }
}
