package com.bankInterest;

public class ComBank extends Banks{

    int amount;

    public ComBank(int amount) {
        this.amount = amount;
    }

    @Override
    public double interest(){
        return this.amount*(0.12);
    }

}
