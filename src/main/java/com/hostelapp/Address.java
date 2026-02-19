package com.hostelapp;

public class Address {
    private String number;
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String country;

    public Address(String number, String address, String zipCode, String city, String state, String country) {
        this.number = number;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address() {
        this.number = null;
        this.address = null;
        this.zipCode = null;
        this.city = null;
        this.state = null;
        this.country = null;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty())
            throw new IllegalArgumentException("O nome da rua não pode estar em branco.");
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        if (zipCode.length() != 8) throw new IllegalArgumentException("O CEP deve ser uma sequencia de 8 digitos");
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.trim().isEmpty())
            throw new IllegalArgumentException("O nome da cidade nao pode esta em branco.");
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null || state.trim().isEmpty())
            throw new IllegalArgumentException("O nome do estado nao pode esta em branco.");
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.trim().isEmpty())
            throw new IllegalArgumentException("O nome do pais nao pode esta em branco.");
        this.country = country;
    }

    @Override
    public String toString() {
        return "\n-ENDERECO-" +
                "\nzip-code...: " + zipCode +
                "\nnumero...: " + number +
                "\nrua...: " + address +
                "\ncidade...: " + city +
                "\nestado...: " + state +
                "\npais...: " + country;
    }
}
