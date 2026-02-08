package com.hostelapp;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentTest pt = new PaymentTest();

        CardPayment dcp = new DebtCardPayment(259.40, "Bradesco", "05973307603", "Florentino Ariza");
        CardPayment ccp = new CreditCardPayment(432.21,"VISA", "13004489654", "Ashley Gasly");

        pt.processPayment(dcp);
        pt.processPayment(ccp);

        CashPayment cp = new CashPayment(75.25, 90.00);
        pt.processPayment(cp);

        CheckPayment cp2 = new CheckPayment(352.91, 52, "Bradesco", 25);
        pt.processPayment(cp2);
    }

    public void processPayment(Payment cp){
        System.out.println("\nProcessando Pagamento\n");
        System.out.println(cp.toString());
    }
}
