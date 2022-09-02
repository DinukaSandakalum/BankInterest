package com.bankInterest;

public class HSBC extends Banks{
    int amount;

    public HSBC(int amount) {
        this.amount = amount;
    }

    @Override
    public double interest(){
        return this.amount*(0.13);
    }

}
