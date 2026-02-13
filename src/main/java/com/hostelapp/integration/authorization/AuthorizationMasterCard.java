package com.hostelapp.integration.authorization;

import com.hostelapp.model.payment.type.CardPayment;

public class AuthorizationMasterCard implements Authorization{
    public boolean authorize(CardPayment cardPayment, double amount){
        // future code provided by issuer to connect with its auth service
        return true;
    }
}
