package com.hostelapp.model.payment;

import java.time.LocalDateTime;

public class Payment extends Expense implements Processable{
    private PaymentType paymentType;
    private LocalDateTime localDateTime;

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
    public LocalDateTime getTime(){
        return localDateTime;
    }

    private String convertDateFormatToString(){
        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();

        String date = day + "/" + month + "/" + year;

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();

        String time = hour + ":" + minute + ":" + second;

        return "Data: " + date + "\n" + "Hora: " + time;
    }

    @Override
    public void process() {
        this.localDateTime = LocalDateTime.now();
        System.out.println("=============== ");
        System.out.println("Processando pagamento");
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        this.localDateTime = LocalDateTime.now(); //remove as soon as a more realistic payment process logic is implemented
        return convertDateFormatToString() + super.toString() + paymentType;
    }
}
