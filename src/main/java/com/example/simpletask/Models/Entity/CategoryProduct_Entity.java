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
}
