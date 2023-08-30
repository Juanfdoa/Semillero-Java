package com.softlond.store.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softlond.store.entities.Category;
import com.softlond.store.repositories.contracts.ICategoryRepository;
import com.softlond.store.services.contracts.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public ResponseEntity<List<Category>> findAll() {
        ResponseEntity<List<Category>> response = new ResponseEntity<List<Category>>(HttpStatus.OK);
        try {
            List<Category> categories = this.categoryRepository.findAll();
            response = new ResponseEntity<List<Category>>(categories, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<List<Category>>(HttpStatus.INTERNAL_SERVER_ERROR);
            return response;
        }
    }

    @Override
     public ResponseEntity<Category> findById(Long id) {
          ResponseEntity<Category> response = new ResponseEntity<Category>(HttpStatus.OK);
        try {
            Category category = this.categoryRepository.findById(id).get();
            response = new ResponseEntity<Category>(category, HttpStatus.OK);
            return response;
        } catch (Exception e) {
            response = new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
            return response;
        }
     }

    @Override
    public ResponseEntity<Category> create(Category category) {
       try {
            Category categorySaved = this.categoryRepository.save(category);
            return new ResponseEntity<Category>(categorySaved, HttpStatus.OK);
       } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Error, la categoria pasado por parametro no puede ser null");
            return new ResponseEntity<Category>(HttpStatus.BAD_REQUEST);
       } catch (Exception e) {
            return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Category> update(Category category) {
       try {
            Category categoryToUpdate = this.categoryRepository.save(category);
            return new ResponseEntity<Category>(categoryToUpdate, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Boolean> Delete(Long id) {
       try {
            this.categoryRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
       } catch (Exception e) {
            return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }


    
}
