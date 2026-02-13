package com.hostelapp;

import com.hostelapp.integration.authorization.Authorization;
import com.hostelapp.integration.authorization.AuthorizationMasterCard;
import com.hostelapp.integration.authorization.AuthorizationVisa;
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

        Payment paymentCash = new Payment(340.00);
        PaymentType cshPmt = new CashPayment(400);
        paymentCash.setPaymentType(cshPmt);


        pt.processPayment(paymentCash);

        Report report = new Report();
        report.add(paymentCash);

        Payment paymentCreditCard = new Payment(278.00);
        PaymentType ccPmt = new CreditCardPayment("VISA", "104489654", "Florentino Ariza");
        paymentCreditCard.setPaymentType(ccPmt);

        Authorization authorizationCreditCard = new AuthorizationVisa();
        paymentCreditCard.setAuthorization(authorizationCreditCard);
        paymentCreditCard.authorize();

        pt.processPayment(paymentCreditCard);
        report.add(paymentCreditCard);

        Payment paymentCheck = new Payment(635.00);
        PaymentType chkPmt = new CheckPayment(73, "Banco do Brasil", 25);
        paymentCheck.setPaymentType(chkPmt);

        pt.processPayment(paymentCheck);
        report.add(paymentCheck);

        Payment paymentDebtCard = new Payment(1230.00);
        PaymentType dcPmt = new DebtCardPayment("Itau", "05973307603", "Ashley Gasly");
        paymentDebtCard.setPaymentType(dcPmt);

        Authorization authorizationDebtCard = new AuthorizationMasterCard();
        paymentDebtCard.setAuthorization(authorizationDebtCard);
        paymentDebtCard.authorize();

        pt.processPayment(paymentDebtCard);
        report.add(paymentDebtCard);

        String temp = report.toString();
        System.out.println(temp);
    }

    public void processPayment(Payment payment){
        payment.process();
    }
}
