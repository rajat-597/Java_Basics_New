package com.oops.concepts.Composition.User_profile_Management;

public class Address {

    private String street;
    private String city;
    private long pinCode;

    public Address(String street, String city, long pinCode) {
        this.street = street;
        this.city = city;
        this.pinCode =pinCode;
    }

    public String getFullAddress(){
        return "Street : " + street + "\n" + " City : " + city + "\n" +  "pinCode " + pinCode;
    }
}
