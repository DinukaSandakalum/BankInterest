package com.bankInterest;

public class Sampath extends Banks {

    int amount;

    public Sampath(int amount) {
        this.amount = amount;
    }

    @Override
    public double interest(){
        return this.amount*(0.12);
    }
}
