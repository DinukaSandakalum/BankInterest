package com.bankInterest;

public class BOC extends Banks{

    int amount;

    public BOC(int amount) {
        this.amount = amount;
    }

    @Override
    public double interest(){
        return this.amount*(0.12);
    }

}
