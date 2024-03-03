package com.tahahanci.ecommerce.services.abstracts;

import com.tahahanci.ecommerce.entities.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAll();
    Product findByID(int id);
    void add(Product product);
    void delete(int id);
    void update(int id, Product product);
}
