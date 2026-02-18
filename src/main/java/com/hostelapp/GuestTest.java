package com.hostelapp;

import java.net.spi.InetAddressResolver;
import java.util.Scanner;

public class GuestTest {
    public static void main(String[] args) {
        GuestRegistrationForm guestRegister = new GuestRegistrationForm();
        Guest guest = guestRegister.createGuest();
    }
}
