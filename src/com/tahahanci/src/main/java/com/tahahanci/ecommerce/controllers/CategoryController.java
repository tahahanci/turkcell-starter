package com.tahahanci.ecommerce.controllers;

import com.tahahanci.ecommerce.entities.Category;
import com.tahahanci.ecommerce.services.abstracts.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.getAll();
    }

    @GetMapping("/id")
    public Category findByID(@RequestParam int id) {
        return categoryService.findByID(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Category category) {
        categoryService.add(category);
    }

    @DeleteMapping("/delete/id")
    public void delete(@RequestParam int id) {
        categoryService.delete(id);
    }

    @PutMapping("/update/id")
    public void update(@RequestParam int id, @RequestBody Category category) {
        categoryService.update(id, category);
    }


}
