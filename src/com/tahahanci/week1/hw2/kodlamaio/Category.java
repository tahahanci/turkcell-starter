package com.tahahanci.week1.hw2.kodlamaio;

public abstract class Category {

    protected String categoryId;
    protected String categoryName;

    public Category(String categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }


}
