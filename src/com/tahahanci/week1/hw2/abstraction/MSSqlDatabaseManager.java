package com.tahahanci.week1.hw2.abstraction;

public class MSSqlDatabaseManager extends BaseDatabaseManager {

    @Override
    public void getData() {
        System.out.println("Data is accessed: MS SQL Server");
    }
}
