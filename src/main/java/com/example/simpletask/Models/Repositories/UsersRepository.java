package com.example.simpletask.Models.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends JpaRepository<UsersRepository,Long> {

    void  deleteByUserId(Long aLong);
    Optional<UsersRepository> findByUserId(Long aLong);
    Optional<UsersRepository>updateUserbyId(Long aLong);
}