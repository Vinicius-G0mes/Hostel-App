package com.hostelapp;

public class CardPayment extends Payment{
    private String cardNumber;
    private String nameOnCard;

    public CardPayment(double amount, String cardNumber, String nameOnCard){
        super(amount);
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

    @Override
    public String toString(){
        return  super.toString()
                +"\nNumero do cartão...: " + this.getCardNumber()
                +"\nNome no cartão...: " + this.getNameOnCard();
    }

}
