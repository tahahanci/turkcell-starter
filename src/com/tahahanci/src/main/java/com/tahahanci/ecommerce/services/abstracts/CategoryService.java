package com.tahahanci.ecommerce.services.abstracts;

import com.tahahanci.ecommerce.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();
    void add(Category category);
    Category findByID(int id);
    void delete(int id);
    void update(int id, Category category);
}
