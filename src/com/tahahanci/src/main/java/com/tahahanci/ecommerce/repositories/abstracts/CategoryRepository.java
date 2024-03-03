package com.tahahanci.ecommerce.repositories.abstracts;

import com.tahahanci.ecommerce.entities.Category;

import java.util.List;

public interface CategoryRepository {

    List<Category> getAll();
    void add(Category category);
    Category findByID(int id);
    void delete(int id);
    void update(int id, Category category);
}
