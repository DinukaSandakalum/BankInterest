package com.bankInterest;

public class Main {
    public static void main(String[] args) {

        AccountBalanace accB = new AccountBalanace();

        Banks boc = new BOC(1000);
        Banks hsbc = new HSBC(1000);

        accB.interestShow(boc);
        accB.interestShow(hsbc);



    }
}