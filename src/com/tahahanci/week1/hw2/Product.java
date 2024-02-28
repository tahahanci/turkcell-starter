package com.tahahanci.week1.hw2;

public class Product {

    int productId;
    String name;
    String description;
    double price;
    int stockAmount;

    public Product(int productId, String name, String description, double price, int stockAmount) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }
}
