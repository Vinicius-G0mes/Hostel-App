package com.hostelapp;

import com.hostelapp.commandline.GuestRegistrationForm;
import com.hostelapp.model.guest.Guest;

public class GuestTest {
    public static void main(String[] args) {
        GuestRegistrationForm guestRegister = new GuestRegistrationForm();
        Guest guest = guestRegister.createGuest();
    }
}
