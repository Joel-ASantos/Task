package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.UsersEntity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,UUID> {
}