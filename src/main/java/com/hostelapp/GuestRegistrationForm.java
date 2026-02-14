package com.hostelapp;

import java.time.LocalDate;
import java.util.Scanner;

public class GuestRegistrationForm {
    public static void main(String[] args) {

        Guest guest = new Guest();
        Address address = new Address();
        Scanner scanner = new Scanner(System.in);
        boolean editGuest = true;
        int dia, mes, ano;
        LocalDate birthDate;

        while (editGuest){
            System.out.println("CADASTRO DE HOSPEDE\n");

            System.out.println("Digite o nome do hospede");
            guest.setFirstName(scanner.nextLine());

            System.out.println("Digite o sobrenome do hospede");
            guest.setLastName(scanner.nextLine());

            System.out.println("Digite o titulo do hospede (ex:Dr,Sr,Dra,Sra) ou Aperte ENTER para deixar em branco");
            guest.setTitle(scanner.nextLine());

            System.out.println("Digite o cpf do hospede");
            guest.setCpf(scanner.nextLine());

            System.out.println("Digite o dia, mes e ano de nascimento do hospede separados por espaco");
            dia = scanner.nextInt();
            mes = scanner.nextInt();
            ano = scanner.nextInt();
            birthDate = LocalDate.of(ano, mes, dia);
            guest.setBirthDate(birthDate);

            scanner.nextLine(); // needed to consume the '\n' remaining from the user command

            System.out.println("Digite o email do hospede");
            guest.setEmail(scanner.nextLine());

            System.out.println("INFORMACOES DE ENDERECO\n");
            System.out.println("Digite CEP");
            address.setZipCode(scanner.nextLine());

            System.out.println("Digite o numero da rua");
            address.setNumber(scanner.nextLine());

            System.out.println("Digite o nome da rua");
            address.setAddress(scanner.nextLine());

            System.out.println("Digite o nome da cidade");
            address.setCity(scanner.nextLine());

            System.out.println("Digite o nome do estado");
            address.setState(scanner.nextLine());

            System.out.println("Digite o nome do pais");
            address.setCountry(scanner.nextLine());

            guest.setAddress(address);

            System.out.println("Exibindo informacoes do hospede criado:");
            System.out.println(guest.toString());
            System.out.println("\n\nDeseja salvar as informacoes do hospede?\n 1 - salvar\n 2 - editar");
            int answer = scanner.nextInt();

            if (answer == 1)
                editGuest = false;
            else if (answer != 2) {
                throw new IllegalArgumentException("Deve ser digitada uma opcao valida");
            }
        }
    }
}
