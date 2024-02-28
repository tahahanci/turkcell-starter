package com.tahahanci.week1.hw2.inheritance;

public class Test {

    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();
        creditUI.calculateCredit(new CustomerCreditManager());
    }
}
