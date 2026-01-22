package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Storage")
public class StorageEntity {

    @Id
    @Column(name = "StorageId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StorageId;

    @Column(name = "ProductQuantity",nullable = false)
    private Integer productQuantity;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

    public Long getStorageId() {
        return this.StorageId;
    }

    public void setStorageId(Long StorageId) {
        this.StorageId = StorageId;
    }

    public Integer getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Instant getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public Instant getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Instant updated_at) {
        this.updated_at = updated_at;
    }

}
