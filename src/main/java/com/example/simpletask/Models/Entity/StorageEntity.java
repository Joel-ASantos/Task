package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "Storage")
public class StorageEntity {

    @Id
    @Column(name = "StorageId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String StorageId;

    @Column(name = "ProductQuantity")
    private Integer productQuantity;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updated_at;
}
