package com.hostelapp;

import java.time.LocalDateTime;

public class Payment extends Expense {
    private PaymentType paymentType;

    public Payment(double amount){
        super(amount);
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString(){
        return  "\nValor do pagamento...: $" + super.getAmount()
                +this.paymentType.toString();
    }

    public LocalDateTime getTime(){
        return LocalDateTime.now();
    }
}
