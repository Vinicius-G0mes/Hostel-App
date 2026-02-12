package com.hostelapp;

public class AuthorizationVisa implements Authorization{

    @Override
    public boolean authorize() {
        // future code provided by issuer to connect with its auth service
        return true;
    }
}
