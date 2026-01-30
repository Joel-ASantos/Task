package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity,Long> {
}
