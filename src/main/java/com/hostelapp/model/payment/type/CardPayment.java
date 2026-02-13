package com.hostelapp.model.payment.type;

import com.hostelapp.model.payment.PaymentType;

public abstract class CardPayment extends PaymentType {
    private String cardNumber;
    private String nameOnCard;
    private boolean authorized;

    public CardPayment(String paymentType, String cardNumber, String nameOnCard){
        super(paymentType);
        this.cardNumber = cardNumber;
        this.nameOnCard = nameOnCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public String toString(){
        String authorization = null;
        if (authorized)
            authorization = "AUTORIZADO";
        else
            authorization = "NAO AUTORIZADO";

        return  super.toString()
                +"\nPagamento " + authorization
                +"\nNumero do cartão...: " + this.getCardNumber()
                +"\nNome no cartão...: " + this.getNameOnCard();
    }

}
