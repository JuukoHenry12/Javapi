package com.Webapplication.webapplication.controller;

import com.Webapplication.webapplication.Entity.CategoryEntity;
import com.Webapplication.webapplication.Service.CategoryService;
import com.Webapplication.webapplication.io.CategoryRequest;
import com.Webapplication.webapplication.io.CategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private  final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest request) {
        return categoryService.addCategory(request);
    }

}
