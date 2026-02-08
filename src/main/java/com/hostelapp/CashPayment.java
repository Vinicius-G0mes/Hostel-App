package com.hostelapp;

public class CashPayment extends Payment{
    private double amountTendered;

    public CashPayment(double amount, double amountTendered){
        super(amount);
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
        return "PAGAMENTO EM DINHEIRO\n"
                +super.toString()
                +"\nValor fornecido...: " + this.amountTendered
                +"\nTroco...: " + (this.amountTendered - super.getAmount()) + "\n";
    }
}
