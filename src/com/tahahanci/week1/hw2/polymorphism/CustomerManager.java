package com.tahahanci.week1.hw2.polymorphism;

public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Customer is added.");
        baseLogger.log("Hello");
    }
}
