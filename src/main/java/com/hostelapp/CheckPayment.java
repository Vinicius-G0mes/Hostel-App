package com.hostelapp;

public class CheckPayment extends PaymentType{
    private int bankId;
    private String bankName;
    private int branchNumber;

    public CheckPayment(int bankId, String bankName, int branchNumber){
        super("Check Payment");
        this.bankId = bankId;
        this.bankName = bankName;
        this.branchNumber = branchNumber;
    }

    public int getBankId(){
        return this.bankId;
    }

    public void setBankId(int bankId){
        this.bankId = bankId;
    }

    public String getBankName(){
        return this.bankName;
    }

    public void setBankName(String bankName){
        this.bankName = bankName;
    }

    public int getBranchNumber(){
        return this.branchNumber;
    }

    public void setBranchNumber(int branchNumber){
        this.branchNumber = branchNumber;
    }

    @Override
    public String toString(){
        return  super.toString()
                +"\nnome do banco...: " + this.bankName
                +"\nID do banco...: " + this.bankId
                +"\nNumero da agencia...: " + this.branchNumber + "\n";
    }
}
