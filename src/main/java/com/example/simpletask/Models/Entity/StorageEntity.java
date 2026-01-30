package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Storage")
public class StorageEntity {

    @Id
    @Column(name = "StorageId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer StorageId;

    @Column(name = "ProductQuantity",nullable = false)
    private Integer productQuantity;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

}
