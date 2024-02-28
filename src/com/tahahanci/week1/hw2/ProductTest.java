package com.tahahanci.week1.hw2;

public class ProductTest {

    public static void main(String[] args) {
        Product product = new Product(1, "Apple", "Device",
                100, 10);
        product.productId = 1;
        product.name = "Apple";
        product.description = "Device";
        product.price = 100;
        product.stockAmount = 10;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
