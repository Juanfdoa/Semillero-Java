package com.softlond.store.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softlond.store.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Long> {
    
}
