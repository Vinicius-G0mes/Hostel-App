package com.hostelapp;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentTest pt = new PaymentTest();

        Payment cashPayment = new Payment(340.00);
        PaymentType cshPmt = new CashPayment(400);
        cashPayment.setPaymentType(cshPmt);

        pt.processPayment(cashPayment);

        Payment creditCardPayment = new Payment(278.00);
        PaymentType ccPmt = new CreditCardPayment("VISA", "104489654", "Florentino Ariza");
        creditCardPayment.setPaymentType(ccPmt);

        pt.processPayment(creditCardPayment);

        Payment checkPayment = new Payment(635.00);
        PaymentType chkPmt = new CheckPayment(73, "Banco do Brasil", 25);
        checkPayment.setPaymentType(chkPmt);

        pt.processPayment(checkPayment);

        Payment debitCard = new Payment(1230.00);
        PaymentType dcPmt = new DebtCardPayment("Itau", "05973307603", "Ashley Gasly");
        debitCard.setPaymentType(dcPmt);

        pt.processPayment(debitCard);
    }

    public void processPayment(Payment payment){
        System.out.println("=================");
        System.out.println("Processando Pagamento");
        System.out.println(payment.toString());
    }
}
