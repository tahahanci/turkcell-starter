package com.tahahanci.week1.hw2.abstraction;

public class OracleDatabaseManager extends BaseDatabaseManager {

    @Override
    public void getData() {
        System.out.println("Data is accessed: Oracle");
    }
}
