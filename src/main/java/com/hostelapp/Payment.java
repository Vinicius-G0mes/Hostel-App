package com.hostelapp;

public class Payment {
    private double amount;
    private PaymentType paymentType;

    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString(){
        return  "\nValor do pagamento...: $" + this.amount
                +this.paymentType.toString();
    }
}
