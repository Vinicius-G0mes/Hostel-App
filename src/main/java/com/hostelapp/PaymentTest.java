package com.hostelapp;

import com.hostelapp.model.payment.Payment;
import com.hostelapp.model.payment.PaymentType;
import com.hostelapp.model.payment.type.CashPayment;
import com.hostelapp.model.payment.type.CheckPayment;
import com.hostelapp.model.payment.type.CreditCardPayment;
import com.hostelapp.model.payment.type.DebtCardPayment;
import com.hostelapp.report.Report;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentTest pt = new PaymentTest();

        Payment cashPayment = new Payment(340.00);
        PaymentType cshPmt = new CashPayment(400);
        cashPayment.setPaymentType(cshPmt);

        pt.processPayment(cashPayment);

        Report report = new Report();
        report.add(cashPayment);

        Payment creditCardPayment = new Payment(278.00);
        PaymentType ccPmt = new CreditCardPayment("VISA", "104489654", "Florentino Ariza");
        creditCardPayment.setPaymentType(ccPmt);

        pt.processPayment(creditCardPayment);
        report.add(creditCardPayment);

        Payment checkPayment = new Payment(635.00);
        PaymentType chkPmt = new CheckPayment(73, "Banco do Brasil", 25);
        checkPayment.setPaymentType(chkPmt);

        pt.processPayment(checkPayment);
        report.add(checkPayment);

        Payment debtCardPayment = new Payment(1230.00);
        PaymentType dcPmt = new DebtCardPayment("Itau", "05973307603", "Ashley Gasly");
        debtCardPayment.setPaymentType(dcPmt);

        pt.processPayment(debtCardPayment);
        report.add(debtCardPayment);

        String temp = null;
        temp = report.toString();
        System.out.println(temp);
    }

    public void processPayment(Payment payment){
        payment.process();
    }
}
