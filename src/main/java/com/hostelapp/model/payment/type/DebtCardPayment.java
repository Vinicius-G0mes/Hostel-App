package com.hostelapp.model.payment.type;

public class DebtCardPayment extends CardPayment {

    private String bankName;

    public DebtCardPayment(String bankName, String cardNumber, String nameOnCard){
        super("Debt Card Payment", cardNumber, nameOnCard);
        this.bankName = bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public String getBankName(){
        return this.bankName;
    }

    @Override
    public String toString(){
        return  super.toString()
                +"\nNome do banco...: " + this.bankName + "\n";
    }
}
