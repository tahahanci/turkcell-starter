package com.tahahanci.week1.hw2.polymorphism;

public class FileLogger extends BaseLogger {

    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
    }
}
