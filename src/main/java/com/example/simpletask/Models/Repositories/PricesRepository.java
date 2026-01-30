package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.PricesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricesRepository extends JpaRepository<PricesEntity, Integer> {
}
