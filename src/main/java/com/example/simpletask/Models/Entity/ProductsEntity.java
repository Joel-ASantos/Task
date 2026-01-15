package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "Products")
public class ProductsEntity {

    @Id
    @Column(name = "Product_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Product_Id;

    @Column(name = "Product_Name")
    private String Product_Name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Search_Fk",referencedColumnName = "Search_Id")
    private SearchEntity search;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CategoryFk",referencedColumnName = "CategoryId")
    private CategoryProduct_Entity Category_Product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PricesFk",referencedColumnName = "PricesId")
    private PricesEntity Prices;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "StorageFk",referencedColumnName = "StorageId")
    private StorageEntity Storage;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updated_at;
}
