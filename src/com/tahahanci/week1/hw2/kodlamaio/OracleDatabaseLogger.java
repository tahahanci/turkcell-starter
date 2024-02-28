package com.tahahanci.week1.hw2.kodlamaio;

public class OracleDatabaseLogger implements Logger {
    @Override
    public String logger(String message) {
        return "Oracle Database Logger: " + message;
    }
}
