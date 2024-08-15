package com.oops.concepts.Composition.User_profile_Management;

public class UserProfile {

   private String name;
   private  Address address;

    public UserProfile(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayProfile(){
        System.out.println("Name of the User is :" + name);
        System.out.println("Address is "+ address.getFullAddress());
    }
}
