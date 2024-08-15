package com.oops.concepts.Composition.User_profile_Management;

public class Main {

    public static void main(String[] args) {

        Address address = new Address("New Colony", "Keonjhar", 758001 );
        UserProfile userProfile = new UserProfile("Rajat",address);
        userProfile.displayProfile();
    }
}
