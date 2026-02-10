package com.hostelapp;

public class CreditCardPayment extends CardPayment{
    private String issuer;

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

    @Override
    public String toString(){
        return  super.toString()
                +"\nOperadora do cartão..: " + this.issuer + "\n";
    }
}
