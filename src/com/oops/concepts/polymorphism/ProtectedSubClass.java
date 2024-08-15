package com.oops.concepts.polymorphism;

import com.oops.concepts.inheritance.Bicycle;

public class ProtectedSubClass extends Bicycle {

    public static void main(String[] args) {
        ProtectedSubClass obj = new ProtectedSubClass();
       boolean b =  obj.selfStart;
        System.out.println(b);
    }

}
