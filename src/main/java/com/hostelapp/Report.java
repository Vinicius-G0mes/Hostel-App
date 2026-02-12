package com.hostelapp;

public class Report {
    private Payment [] payments;
    private int index;

    public Report(){
        payments = new Payment[2];
        index = 0;
    }

    public void add(Payment payment){
        payments[index] = payment;
        index++;
    }

    public String toString(){
        String temp = "";
        for(Payment x : payments){
            temp = temp + x.toString() + "\n";
        }
        return temp;
    }

    public static void main(String[] args) {
        Report payments = new Report();

        Payment creditCard = new Payment(385.50);
        creditCard.setPaymentType(new CreditCardPayment("VISA", "1030654654", "Augusto Tavares"));

        payments.add(creditCard);

        Payment debtCard = new Payment(385.50);
        debtCard.setPaymentType(new DebtCardPayment("Bradesco", "079521503", "Micaele Torres"));

        payments.add(debtCard);

        System.out.println(payments.toString());
    }
}
