package com.softlond.store.repositories.contracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.softlond.store.entities.Product;

public interface IProductRepository extends JpaRepository<Product, Long>{
    @Query(value = "SELECT * FROM products WHERE price > :price", nativeQuery = true)
    public List<Product> productsWithHigherPrice(@Param ("price") double price);

    public Product findByName(@Param ("name") String name);
}
