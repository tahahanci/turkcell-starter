package com.tahahanci.ecommerce.controllers;

import com.tahahanci.ecommerce.entities.Product;
import com.tahahanci.ecommerce.services.abstracts.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {
        return productService.getAll();
    }

    @GetMapping("/id")
    public Product findByID(@RequestParam int id) {
        return productService.findByID(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Product product) {
        productService.add(product);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        productService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Product product) {
        productService.update(id, product);
    }


}
