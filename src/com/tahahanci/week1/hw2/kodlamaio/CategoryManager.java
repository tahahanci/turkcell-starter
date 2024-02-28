package com.tahahanci.week1.hw2.kodlamaio;

public class CategoryManager {

    Category category;
    Logger logger;

    public CategoryManager(Category category, Logger logger) {
        this.category = category;
        this.logger = logger;
    }

    public void add(Category category) {
        System.out.println("Category is added: " + category.getCategoryName());
        System.out.println(logger.logger("Added!"));
    }

    public void delete(Category category) {
        System.out.println("Category is deleted: " + category.getCategoryName());
        System.out.println(logger.logger("Deleted!"));
    }
}
