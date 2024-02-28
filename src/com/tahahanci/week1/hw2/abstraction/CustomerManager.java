package com.tahahanci.week1.hw2.abstraction;

public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;

    public CustomerManager(BaseDatabaseManager baseDatabaseManager) {
        this.baseDatabaseManager = baseDatabaseManager;
    }

    public void getCustomer() {
        baseDatabaseManager.getData();
    }
}
