package com.hostelapp.model.payment.type;

import com.hostelapp.model.payment.PaymentType;

public class CashPayment extends PaymentType {
    private double amountTendered;

    public CashPayment(double amountTendered){
        super("Cash Payment");
        this.amountTendered = amountTendered;
    }

    public double getAmountTendered(){
        return this.amountTendered;
    }

    public void setAmountTendered(double amountTendered){
        this.amountTendered = amountTendered;
    }

    @Override
    public String toString(){
        return  super.toString()
                +"\nValor fornecido...: " + this.amountTendered + "\n";
    }
}
