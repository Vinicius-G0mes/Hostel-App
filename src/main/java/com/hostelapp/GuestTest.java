package com.hostelapp;

import java.util.Scanner;

public class GuestTest {
    public static void main(String[] args) {

        Guest guest = new Guest();
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Informe o nome do hóspede:");
        guest.setFirstName(scanner.nextLine());
        System.out.println("Informe o último sobrenome do hóspede:");
        guest.setLastName(scanner.nextLine());

        if (guest.isValid())
            System.out.println("\nInformações do novo hóspede:\n" + guest.getFirstName() + " " + guest.getLastName());
        else
            System.out.println("\nERRO: Tanto o nome e o sobrenome devem conter apenas letras e ter ao menos dois caracteres cada.\n");
    }
}
