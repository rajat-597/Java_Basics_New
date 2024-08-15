package com.oops.concepts.inheritance;

public class Bicycle {

   public int gear;
   public int speed;

   protected boolean selfStart;

   public Bicycle(){
       this.gear = 1;
       this.speed = 1;
       this.selfStart = true;
   }

   // parameterized constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // copy constructor
    public Bicycle(Bicycle old){
        this.speed = old.speed;
        this.gear = old.gear;
    }

    public void applyBrake(int decrement){
        this.speed = speed-decrement;
        System.out.println("Apply brakes and speed reduced to "+ this.speed);
    }

    public void speedUp(int increment){
        this.speed = speed+increment;
        System.out.println("speed increases to "+ this.speed);

    }


    public  String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
