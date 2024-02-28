package com.tahahanci.week1.hw2.kodlamaio;

public class MSSqlLogger implements Logger {
    @Override
    public String logger(String message) {
        return "MS SQL Logger: " + message;
    }
}
