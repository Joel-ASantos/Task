package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Prices")
public class PricesEntity {

    @Id
    @Column(name = "PricesId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PricesId;

    @Column(name = "Value",nullable = false)
    private Float Value;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

}
