package com.tahahanci.ecommerce.repositories.concretes;

import com.tahahanci.ecommerce.entities.Product;
import com.tahahanci.ecommerce.repositories.abstracts.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepositoryImpl(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public List<Product> getAll() {
        return productList;
    }

    @Override
    public Product findByID(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int id) {
        Product p = findByID(id);
        productList.remove(p);
    }

    @Override
    public void update(int id, Product productToUpdate) {
        int i = 0;
        for (Product product : productList) {
            if (productToUpdate.getId() == id) {
                i = productList.indexOf(product);
                break;
            }
        }
        productList.set(i, productToUpdate);
    }
}
