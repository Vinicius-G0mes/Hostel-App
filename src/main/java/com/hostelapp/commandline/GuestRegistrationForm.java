package com.hostelapp.commandline;

import com.hostelapp.model.address.Address;
import com.hostelapp.model.guest.Guest;

import java.time.LocalDate;
import java.util.Scanner;

public class GuestRegistrationForm {

    private final Scanner scanner = new Scanner(System.in);

    private void fillFirstName(Guest guest) {
        while (true) {
            try {
                System.out.println("Digite o nome do hospede");
                guest.setFirstName(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillLastName(Guest guest) {
        while (true) {
            try {
                System.out.println("Digite o ultimo sobrenome do hospede");
                guest.setLastName(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillTitle(Guest guest) {
        while (true) {
            try {
                System.out.println("Digite o titulo do hospede (ex:Dr,Sr,Dra,Sra) ou Aperte ENTER para deixar em branco");
                guest.setTitle(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void fillCPF(Guest guest) {
        while (true) {
            try {
                System.out.println("Digite o cpf do hospede");
                guest.setCpf(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillBirthDate(Guest guest) { // maybe potential bug when passed a date with missing fields
        int day, month, year;
        LocalDate birthDate;
        while (true) {
            try {
                System.out.println("Digite o dia, mes e ano de nascimento do hospede separados por espaco");
                day = scanner.nextInt();
                month = scanner.nextInt();
                year = scanner.nextInt();
                birthDate = LocalDate.of(year, month, day);
                guest.setBirthDate(birthDate);
                scanner.nextLine(); // needed to consume the '\n' remaining from the user command
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); //needed to prevent infinite loop
            }
        }
    }

    private void fillEMail(Guest guest) {
        while (true) {
            try {
                System.out.println("Digite o email do hospede");
                guest.setEmail(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillZipCode(Address address) {
        while (true) {
            try {
                System.out.println("Digite CEP");
                address.setZipCode(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillNumber(Address address) {
        while (true) {
            try {
                System.out.println("Digite o numero da rua");
                address.setNumber(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillAddress(Address address) {
        while (true) {
            try {
                System.out.println("Digite o nome da rua");
                address.setAddress(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillCity(Address address) {
        while (true) {
            try {
                System.out.println("Digite o nome da cidade");
                address.setCity(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillState(Address address) {
        while (true) {
            try {
                System.out.println("Digite o nome do estado");
                address.setState(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void fillCountry(Address address) {
        while (true) {
            try {
                System.out.println("Digite o nome do pais");
                address.setCountry(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public Guest createGuest() {

        Guest guest = new Guest();
        Address address = new Address();

        System.out.println("\n=====CADASTRO DE HOSPEDE=====\n");
        fillFirstName(guest);
        fillLastName(guest);
        fillTitle(guest);
        fillCPF(guest);
        fillBirthDate(guest);
        fillEMail(guest);

        System.out.println("\nINFORMACOES DE ENDERECO");
        fillZipCode(address);
        fillNumber(address);
        fillAddress(address);
        fillCity(address);
        fillState(address);
        fillCountry(address);

        guest.setAddress(address);

        System.out.println("Exibindo informacoes do hospede criado:");
        System.out.println(guest.toString());

        int edit = edit();

        while (edit == 2) {
            System.out.println("Deseja editar informacoes do hospede ou da residencia dele?");
            System.out.println("1- informacoes do hospede \n2- informacoes da residencia");
            int guestOrAddress = scanner.nextInt();
            scanner.nextLine();
            if (guestOrAddress == 1) {
                editGuest(guest);
                edit = edit();
                scanner.nextLine();
            } else if (guestOrAddress == 2) {
                editAddress(address);
                edit = edit();
                scanner.nextLine();
            }
        }

        System.out.println("Informacoes salvas!");

        return guest;

    }

    private int edit() {
        System.out.println("\nDeseja salvar as informacoes do hospede?");
        System.out.println("1- salvar" +
                "\n2- editar");
        int answer = scanner.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.println("opcao invalida, tente novamente.");
            answer = scanner.nextInt();
        }
        return answer;
    }

    private void editGuest(Guest guest) {

        int option = -1;

        do {
            System.out.println("EDITAR hospede:" +
                    "\n1- CPF \n2- titulo\n3- nome\n4- sobrenome" +
                    "\n5- data de nascimento\n6- email\n0- SAIR");

            while (!scanner.hasNextInt()) {
                System.out.println("Opcao digitada invalida. Tente novamente.");
                scanner.next();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    break;
                case 1:
                    fillCPF(guest);
                    break;
                case 2:
                    fillTitle(guest);
                    break;
                case 3:
                    fillFirstName(guest);
                    break;
                case 4:
                    fillLastName(guest);
                    break;
                case 5:
                    fillBirthDate(guest);
                    break;
                case 6:
                    fillEMail(guest);
                    break;
                default:
                    System.out.println("Opcao invalida digitada. Tente novamente.");
            }

        } while (option != 0);

        System.out.println("saindo do modo de edicao.\n");
        System.out.println(guest.toString());
    }

    private void editAddress(Address address) {

        int option = -1;


        do {
            System.out.println("EDITAR endereco:" +
                    "\n1- numero\n2- rua\n3- CEP\n4- cidade\n5- estado\n6- pais\n0- SAIR");

            while (!scanner.hasNextInt()) {
                System.out.println("Opcao invalida. Tente novamente.");
                scanner.next();
            }

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    break;
                case 1:
                    fillNumber(address);
                    break;
                case 2:
                    fillAddress(address);
                    break;
                case 3:
                    fillZipCode(address);
                    break;
                case 4:
                    fillCity(address);
                    break;
                case 5:
                    fillState(address);
                    break;
                case 6:
                    fillCountry(address);
                    break;
                default:
                    System.out.println("Opcao invalida digitada. Tente novamente.");
            }

        } while (option != 0);

        System.out.println("saindo do modo de edicao.\n");
        System.out.println(address.toString());
    }
}
