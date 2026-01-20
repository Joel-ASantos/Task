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

    public String getStorageId() {
        return this.StorageId;
    }

    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    public Integer getProductQuantity() {
        return this.productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
