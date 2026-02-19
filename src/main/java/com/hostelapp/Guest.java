package com.hostelapp;

import java.time.LocalDate;

public class Guest {

    private String cpf;
    private String title;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private Address address;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11 || cpf.trim().isEmpty())
            throw new IllegalArgumentException("Cpf deve conter 11 digitos");
        this.cpf = cpf;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null)
            this.title = "";
        else
            this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2)
            throw new IllegalArgumentException("O nome nao pode ficar em branco e deve ter no minimo dois caracteres");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 2)
            throw new IllegalArgumentException("O sobrenome deve ter no minimo dois caracteres");
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() < 2 || !email.contains("@"))
            throw new IllegalArgumentException("O endereco de email nao pode estar em branco e deve ser valido");
        this.email = email;
    }

    @Override
    public String toString() {

        return "\n==INFORMACOES DO HOSPEDE==" +
                "\nNome...: " + title + " " + firstName + " " + lastName +
                "\nCPF...: " + cpf +
                "\ne-mail...: " + email +
                address.toString();
    }
}
