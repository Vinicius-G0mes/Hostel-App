package com.hostelapp;

import java.time.LocalDate;
import java.util.Scanner;

public class GuestRegistrationForm {

    private Scanner scanner = new Scanner(System.in);

    private void fillFirstName(Guest guest){
        while(true){
            try{
                System.out.println("Digite o nome do hospede");
                guest.setFirstName(scanner.nextLine());
                break;
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
    }

    private void fillLastName (Guest guest){
        while (true){
            try{
                System.out.println("Digite o ultimo sobrenome do hospede");
                guest.setLastName(scanner.nextLine());
                break;
            }catch (Exception exception){
                System.out.println(exception);
            }
        }
    }

    private void fillTitle (Guest guest){
        while (true){
            try{
                System.out.println("Digite o titulo do hospede (ex:Dr,Sr,Dra,Sra) ou Aperte ENTER para deixar em branco");
                guest.setTitle(scanner.nextLine());
                break;
            }catch (Exception exception){
                System.out.println(exception);
            }
        }
    }

    public void fillCPF (Guest guest){
        while (true){
            try{
                System.out.println("Digite o cpf do hospede");
                guest.setCpf(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillBirthDate (Guest guest){ // maybe potential bug when passed a date with missing fields
        int day, month, year;
        LocalDate birthDate;
        while (true){
            try{
                System.out.println("Digite o dia, mes e ano de nascimento do hospede separados por espaco");
                day = scanner.nextInt();
                month = scanner.nextInt();
                year = scanner.nextInt();
                birthDate = LocalDate.of(year, month, day);
                guest.setBirthDate(birthDate);
                scanner.nextLine(); // needed to consume the '\n' remaining from the user command
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillEMail (Guest guest){
        while (true){
            try{
                System.out.println("Digite o email do hospede");
                guest.setEmail(scanner.nextLine());
                break;
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public void fillZipCode (Address address){
        while (true){
            try{
                System.out.println("Digite CEP");
                address.setZipCode(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillNumber (Address address){
        while (true){
            try{
                System.out.println("Digite o numero da rua");
                address.setNumber(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillAddress (Address address){
        while (true){
            try{
                System.out.println("Digite o nome da rua");
                address.setAddress(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillCity (Address address){
        while (true){
            try{
                System.out.println("Digite o nome da cidade");
                address.setCity(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillState (Address address){
        while (true){
            try{
                System.out.println("Digite o nome do estado");
                address.setState(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void fillCountry (Address address){
        while (true){
            try{
                System.out.println("Digite o nome do pais");
                address.setCountry(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        Guest guest = new Guest();
        Address address = new Address();
        GuestRegistrationForm guestRegistration = new GuestRegistrationForm();

        System.out.println("=====CADASTRO DE HOSPEDE=====\n");
        guestRegistration.fillFirstName(guest);
        guestRegistration.fillLastName(guest);
        guestRegistration.fillTitle(guest);
        guestRegistration.fillCPF(guest);
        guestRegistration.fillBirthDate(guest);
        guestRegistration.fillEMail(guest);

        System.out.println("\nINFORMACOES DE ENDERECO");
        guestRegistration.fillZipCode(address);
        guestRegistration.fillNumber(address);
        guestRegistration.fillAddress(address);
        guestRegistration.fillCity(address);
        guestRegistration.fillState(address);
        guestRegistration.fillCountry(address);

        guest.setAddress(address);

        System.out.println("Exibindo informacoes do hospede criado:");
        System.out.println(guest.toString());

    }
}
