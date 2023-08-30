package com.softlond.store.services.implementations;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.softlond.store.entities.Product;
import com.softlond.store.repositories.contracts.IProductRepository;
import com.softlond.store.services.contracts.IProductService;

@Service
public class ProductService implements IProductService {

     private static final Logger logger = LogManager.getLogger(ProductService.class);

    @Autowired
    private IProductRepository productRepository;

    @Override
    public ResponseEntity<List<Product>> findAll() {
       ResponseEntity<List<Product>> response = new ResponseEntity<List<Product>>(HttpStatus.OK);
       try {
          List<Product> products = this.productRepository.findAll();
          response = new ResponseEntity<List<Product>>(products, HttpStatus.OK);
          return response;
       } catch (Exception e) {
          logger.error("Error, se presento un error al obtener la lista de productos" + 
          "\nError: " + e);
          logger.info("Trace: " + e.getStackTrace()[0].getFileName() + " Line: " + e.getStackTrace()[0].getLineNumber());
          logger.info("Trace: " + e.getStackTrace()[1].getFileName());
          logger.info("Trace: " + e.getStackTrace()[2].getFileName());
          response = new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
          return response;
       } 
    }

    @Override
    public ResponseEntity<Product> findById(Long id) {
     ResponseEntity<Product> response = new ResponseEntity<Product>(HttpStatus.OK);
     try {
        Product product = this.productRepository.findById(id).get();
        response = new ResponseEntity<Product>(product, HttpStatus.OK);
        return response;
     } catch (Exception e) {
        response = new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        return response;
     }
    }

     @Override
     public ResponseEntity<Product> create(Product product) {
          try {
               Product productSaved = this.productRepository.save(product);
               return new ResponseEntity<Product>(productSaved, HttpStatus.OK);
          } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
               System.out.println("Error, el producto pasado por parametro no puede ser null");
               return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
          }catch (OptimisticLockingFailureException e) {
               return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
          }catch (Exception e) {
              return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
     }

     @Override
     public ResponseEntity<Product> update(Product product) {
          try {
               Product productToUpdate = this.productRepository.save(product);
               return new ResponseEntity<Product>(productToUpdate, HttpStatus.OK);
          } catch (Exception e) {
               return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
     }

     @Override
     public ResponseEntity<Boolean> Delete(Long id) {
          try {
               this.productRepository.deleteById(id);
               return new ResponseEntity<Boolean>(true, HttpStatus.OK);
          } catch (Exception e) {
               return new ResponseEntity<Boolean>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
     }

     @Override
     public ResponseEntity<List<Product>> productsWithHigherPrice(Double price) {
         try {
               List<Product> products = this.productRepository.productsWithHigherPrice(price);
               return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
         } catch (Exception e) {
               return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }

     @Override
     public ResponseEntity<Product> findByName(String name) {
          try {
               Product product = this.productRepository.findByName(name);
               return new ResponseEntity<Product>(product, HttpStatus.OK);
          } catch (Exception e) {
               return new ResponseEntity<Product>(HttpStatus.INTERNAL_SERVER_ERROR);
          }
     }

    
}
