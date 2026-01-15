package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "Prices")
public class PricesEntity {

    @Id
    @Column(name = "PricesId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String PricesId;

    @Column(name = "Value")
    private Float Value;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updated_at;
}
