package com.tahahanci.ecommerce.repositories.concretes;

import com.tahahanci.ecommerce.entities.Category;
import com.tahahanci.ecommerce.repositories.abstracts.CategoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private List<Category> categoryList = new ArrayList<>();

    public CategoryRepositoryImpl(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
    }

    @Override
    public void add(Category category) {
        categoryList.add(category);
    }

    @Override
    public Category findByID(int id) {
        for (Category category : categoryList) {
            if (category.getId() == id) {
                return category;
            }
        }
        return null;
    }

    @Override
    public void delete(int id) {
        Category category = findByID(id);
        categoryList.remove(category);
    }

    @Override
    public void update(int id, Category categoryToUpdate) {
        int i = 0;
        for (Category category : categoryList) {
            if (categoryToUpdate.getId() == id) {
                i = categoryList.indexOf(category);
                break;
            }
        }
        categoryList.set(i, categoryToUpdate);
    }
}
