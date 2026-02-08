package com.hostelapp;

public class DebtCardPayment extends CardPayment {

    private String bankName;

    public DebtCardPayment(double amount, String bankName, String cardNumber, String nameOnCard){
        super(amount, cardNumber, nameOnCard);
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
        return "PAGAMENTO EM DEBITO:\n"
                +super.toString()
                +"\nNome do banco...: " + this.bankName + "\n";
    }
}
