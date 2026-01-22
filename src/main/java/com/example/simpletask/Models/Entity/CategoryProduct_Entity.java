package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Category_Product")
public class CategoryProduct_Entity {

    @Id
    @Column(name = "CategoryId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryId;

    @Column(name = "Category_Name",nullable = false)
    private String Category_Name;

    @OneToMany(mappedBy = "Product_Id",cascade = CascadeType.ALL)
    private List<ProductsEntity> products = new ArrayList<>();

    @Column(name = "CreatedAt",nullable = false)
    private Instant createdAt;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updatedAt;

    public Long getCategoryId() {
        return this.CategoryId;
    }

    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getCategory_Name() {
        return this.Category_Name;
    }

    public void setCategory_Name(String Category_Name) {
        this.Category_Name = Category_Name;
    }

    public List<ProductsEntity> getProducts() {
        return this.products;
    }

    public void setProducts(List<ProductsEntity> products) {
        this.products = products;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

}
