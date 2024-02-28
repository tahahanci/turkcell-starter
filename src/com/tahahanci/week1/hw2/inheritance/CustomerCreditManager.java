package com.tahahanci.week1.hw2.inheritance;

public class CustomerCreditManager extends BaseCreditManager {
    @Override
    public void calculate() {
        System.out.println("Calculated credit for Customer!");
    }
}
