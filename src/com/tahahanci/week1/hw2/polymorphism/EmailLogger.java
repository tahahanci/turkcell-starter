package com.tahahanci.week1.hw2.polymorphism;

public class EmailLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("Email Logger: " + message);
    }
}
