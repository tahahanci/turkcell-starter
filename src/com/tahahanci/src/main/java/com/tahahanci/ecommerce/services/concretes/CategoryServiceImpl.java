package com.tahahanci.ecommerce.services.concretes;

import com.tahahanci.ecommerce.entities.Category;
import com.tahahanci.ecommerce.repositories.abstracts.CategoryRepository;
import com.tahahanci.ecommerce.services.abstracts.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    @Override
    public void add(Category category) {
        if (isCategoryExist(category))
            throw new RuntimeException("This category is already added.");
        if (isNameBlank(category))
            throw new RuntimeException("Please enter an valid name");
        categoryRepository.add(category);
    }

    @Override
    public Category findByID(int id) {
        return categoryRepository.findByID(id);
    }

    @Override
    public void delete(int id) {
        Category categoryToDelete = findByID(id);
        if (categoryToDelete == null)
            throw new RuntimeException("There is no such an category!");
        categoryRepository.delete(id);
    }

    @Override
    public void update(int id, Category category) {
        if (isCategoryExist(category))
            throw new RuntimeException("This category is already added!");
        if (isNameBlank(category))
            throw new RuntimeException("You should give a name!");
        if (findByID(id) == null)
            throw new RuntimeException("There is no such an language!");
        categoryRepository.update(id, category);
    }

    private boolean isCategoryExist(Category categoryToCheck) {
        List<Category> categoryList = categoryRepository.getAll();
        for (Category category : categoryList) {
            if (category.getCategoryName().equals(categoryToCheck.getCategoryName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isNameBlank(Category category) {
        return category.getCategoryName().isBlank();
    }
}
