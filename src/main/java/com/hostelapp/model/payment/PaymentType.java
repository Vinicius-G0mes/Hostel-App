package com.hostelapp.model.payment;

public abstract class PaymentType {
    private String paymentType;

    public PaymentType(String paymentType){
        this.paymentType = paymentType;
    }

    public String getPaymentType(){
        return this.paymentType;
    }

    public void setPaymentType(double amount){
        this.paymentType = paymentType;
    }

    @Override
    public String toString(){
        return "\nTipo do pagamento...: " + this.paymentType;
    }
}
