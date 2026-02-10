package com.Webapplication.webapplication.controller;

import com.Webapplication.webapplication.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CategoryController {

    public CategoryController(JpaRepository jpaRepository) {

    }

    public CategoryEntity addCategory(CategoryEntity categoryEntity) {
        return null;
    }

}
