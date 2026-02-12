package com.hostelapp;

import java.time.LocalDateTime;

public abstract class Processable {
    private double amount;

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public Processable(double amount){
        this.amount = amount;
    }

    public abstract LocalDateTime getTime();
}
