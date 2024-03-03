package com.tahahanci.ecommerce.entities;

public class Product extends BaseEntity {

    private String productName;
    private int categoryID;
    private double productPrice;
    private int stockAmount;

    public Product(int id, String productName, int categoryID, double productPrice, int stockAmount) {
        super(id);
        this.productName = productName;
        this.categoryID = categoryID;
        this.productPrice = productPrice;
        this.stockAmount = stockAmount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
