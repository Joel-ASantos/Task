package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.CategoryProduct_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProduct_Repository extends JpaRepository<CategoryProduct_Entity, Integer> {
}
