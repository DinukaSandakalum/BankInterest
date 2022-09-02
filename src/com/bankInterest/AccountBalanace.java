package com.bankInterest;

public class AccountBalanace {

    public void interestShow(Banks bank){

        String bankName = "";

        if (bank instanceof BOC){
            bankName = "BOC";
        }
        else if (bank instanceof ComBank){
            bankName = "ComBank";
        }
        else if (bank instanceof HSBC){
            bankName = "HSBC";
        }
        else if (bank instanceof Peoples){
            bankName = "Peoples";
        }
        else if (bank instanceof Sampath){
            bankName = "Sampath";
        }

        System.out.println( bankName + " Bank interset is " + bank.interest());
    }

}
