package com.hostelapp;

public class CreditCardPayment extends CardPayment{
    private String issuer;

    public CreditCardPayment(double amount, String issuer, String cardNumber, String nameOnCard){
        super(amount, cardNumber, nameOnCard);
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
        return  "PAGAMENTO EM CRÉDITO:\n"
                +super.toString()
                +"\nOperadora do cartão..: " + this.issuer + "\n";
    }
}
