package com.tahahanci.week1.hw2.polymorphism;

public class DatabaseLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("Database logger: " + message);
    }
}
