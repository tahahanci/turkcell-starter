package com.tahahanci.week1.hw2.abstraction;

public class Test {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleDatabaseManager());
        customerManager.getCustomer();
    }
}
