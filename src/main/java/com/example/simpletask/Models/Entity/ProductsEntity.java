package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Products")
public class ProductsEntity {

    @Id
    @Column(name = "Product_Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Product_Id;

    @Column(name = "Product_Name",nullable = false)
    private String Product_Name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Search_Fk",referencedColumnName = "Search_Id",nullable = false)
    private SearchEntity search;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CategoryFk",referencedColumnName = "CategoryId",nullable = false)
    private CategoryProduct_Entity Category_Product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PricesFk",referencedColumnName = "PricesId",nullable = false)
    private PricesEntity Prices;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StorageFk",referencedColumnName = "StorageId",nullable = false)
    private StorageEntity Storage;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;
    
    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

}
