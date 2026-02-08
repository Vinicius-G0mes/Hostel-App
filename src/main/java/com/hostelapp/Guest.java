package com.hostelapp;

public class Guest {

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isValid(Guest guest){
        if (guest.firstName == null || guest.firstName.length() < 2) return false;
        if (guest.lastName == null || guest.lastName.length() < 2) return false;

        return true;
    }
}
