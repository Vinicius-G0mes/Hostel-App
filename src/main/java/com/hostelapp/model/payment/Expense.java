package com.hostelapp.model.payment;

import java.time.LocalDateTime;

public abstract class Expense {
    private double amount;

    public double getAmount(){
        return amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public Expense(double amount){
        this.amount = amount;
    }

    public abstract LocalDateTime getTime();

    @Override
    public String toString(){
        return "\nValor do pagamento...: $" + amount;
    }
}
