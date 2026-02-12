package com.example.simpletask.Models.Repositories;

import com.example.simpletask.Models.Entity.SearchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface SearchRepository extends JpaRepository<SearchEntity,UUID> {
    Optional<SearchEntity> SearchMechanism(String search,UUID UserId,UUID CategoryId);
}
