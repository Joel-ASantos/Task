package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<UsersEntity,Integer> {
}
