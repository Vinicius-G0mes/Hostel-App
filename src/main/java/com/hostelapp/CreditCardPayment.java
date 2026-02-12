package com.hostelapp;

import java.time.LocalDate;

public class CreditCardPayment extends CardPayment{
    private String issuer;
    LocalDate expirationDate = LocalDate.now();
    private String securityCode;

    public CreditCardPayment(String issuer, String cardNumber, String nameOnCard){
        super("Credit Card Payment", cardNumber, nameOnCard);
        this.issuer = issuer;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getSecurityCode(){
        return this.securityCode;
    }

    public void setSecurityCode(String securityCode){
        this.securityCode = securityCode;
    }

    @Override
    public String toString(){
        return  super.toString()
                +"\nOperadora do cartão..: " + this.issuer + "\n";
    }
}
