package com.accounting.accountingrest.controller;

import com.accounting.accountingrest.request.AccountingSystemRequest;
import com.accounting.accountingrest.request.CategoryRequest;
import com.accounting.accountingrest.response.AccountingSystemResponse;
import com.accounting.accountingrest.response.CategoryResponse;
import com.accounting.accountingrest.service.AccountingSystemService;
import com.accounting.accountingrest.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryResponse> getAllCategories(){
        return categoryService.findAll();
    }

    @PostMapping
    ResponseEntity<HttpStatus> createCategory(@RequestBody CategoryRequest categoryRequest){
        categoryService.createCategory(categoryRequest);
        return new ResponseEntity<>(HttpStatus.valueOf(204));
    }
}
