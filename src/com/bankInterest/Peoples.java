package com.bankInterest;

public class Peoples extends Banks{

    int amount;

    public Peoples(int amount) {
        this.amount = amount;
    }

    @Override
    public double interest(){
        return this.amount*(0.15);
    }
}
