package com.tahahanci.week1.hw2;

public class CustomerManager {

    public void add() {
        System.out.println("Customer added!");
    }

    public void delete() {
        System.out.println("Customer deleted!");
    }

    public void update() {
        System.out.println("Customer updated!");
    }

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.delete();
        customerManager.update();
    }
}
