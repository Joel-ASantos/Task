package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Category_Product")
public class CategoryProduct_Entity {

    @Id
    @Column(name = "CategoryId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CategoryId;

    @Column(name = "Category_Name",nullable = false)
    private String Category_Name;

    @OneToMany(mappedBy = "Product_Id",cascade = CascadeType.ALL)
    private List<ProductsEntity> products = new ArrayList<>();

    @Column(name = "CreatedAt",nullable = false)
    private Instant createdAt;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updatedAt;

}
