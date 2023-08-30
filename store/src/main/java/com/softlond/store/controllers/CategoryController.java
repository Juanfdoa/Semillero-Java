package com.softlond.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.softlond.store.constants.ApiConstants;
import com.softlond.store.entities.Category;
import com.softlond.store.services.contracts.ICategoryService;

@RestController
@RequestMapping(ApiConstants.CATEGORY)
public class CategoryController {
    
    @Autowired
    private ICategoryService categoryService;

    @GetMapping(ApiConstants.LIST)
    public ResponseEntity<List<Category>> getAllCategories(){
        return this.categoryService.findAll();
    }

    @GetMapping(ApiConstants.FIND_BY_ID)
    public ResponseEntity<Category> getCategoryById(Long id){
        return this.categoryService.findById(id);
    }

    @PostMapping(ApiConstants.CREATE)
    public ResponseEntity<Category> create(@RequestBody Category category){
        return this.categoryService.create(category);
    }

    @PutMapping(ApiConstants.UPDATE)
    public ResponseEntity<Category> update(@RequestBody Category category){
        return this.categoryService.update(category);
    }

    @DeleteMapping(ApiConstants.DELETE)
    public ResponseEntity<Boolean> delete(@RequestParam Long id){
        return this.categoryService.Delete(id);
    }
}
