package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Category_Product")
public class CategoryProduct_Entity {

    @Id
    @Column(name = "CategoryId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String CategoryId;

    @Column(name = "Category_Name")
    private String Category_Name;

    @OneToMany
    @JoinColumn(name = "ProductFk",referencedColumnName = "Product_Id")
    private List<ProductsEntity> products = new ArrayList<>();

    @Timestamp
    @Column(name = "CreatedAt")
    private Date createdAt;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updatedAt;

    public String getCategoryId() {
        return this.CategoryId;
    }

    public void setCategoryId(String CategoryId) {
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

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
