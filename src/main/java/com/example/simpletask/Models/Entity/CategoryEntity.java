package com.example.simpletask.Models.Entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Categoria")
public class CategoryEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "Name",nullable = false)
    private String Name;

    @Column(name = "Created_at")
    private Instant Created_at;

    @Column(name = "Updated_at")
    private Instant Updated_at;

}
