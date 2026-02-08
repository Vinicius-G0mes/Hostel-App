package com.hostelapp;

public class Payment {
    private double amount;

    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Valor do pagamento...: $" + String.valueOf(this.amount);
    }
}
