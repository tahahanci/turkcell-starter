package com.tahahanci.ecommerce.services.concretes;

import com.tahahanci.ecommerce.entities.Product;
import com.tahahanci.ecommerce.repositories.abstracts.ProductRepository;
import com.tahahanci.ecommerce.services.abstracts.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product findByID(int id) {
        return productRepository.findByID(id);
    }

    @Override
    public void add(Product product) {
        if (isProductExist(product))
            throw new RuntimeException("This product is already added!");
        if (isNameBlank(product))
            throw new RuntimeException("Please enter a valid name!");
        productRepository.add(product);
    }

    @Override
    public void delete(int id) {
        Product product = findByID(id);
        if (product == null)
            throw new RuntimeException("There is no such a product");
        productRepository.delete(id);
    }

    @Override
    public void update(int id, Product product) {
        if (isProductExist(product))
            throw new RuntimeException("This category is already added!");
        if (isNameBlank(product))
            throw new RuntimeException("You should give a name!");
        if (findByID(id) == null)
            throw new RuntimeException("There is no such an id!");
        productRepository.update(id, product);
    }

    private boolean isProductExist(Product productToCheck) {
        List<Product> productList = productRepository.getAll();
        for (Product product : productList) {
            if (productToCheck.getProductName().equals(product.getProductName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isNameBlank(Product productToCheck) {
        return productToCheck.getProductName().isBlank();
    }
}
