package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Products")
public class ProductsEntity {

    @Id
    @Column(name = "Product_Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Product_Id;

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

    public Long getProduct_Id() {
        return this.Product_Id;
    }

    public void setProduct_Id(Long Product_Id) {
        this.Product_Id = Product_Id;
    }

    public String getProduct_Name() {
        return this.Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public SearchEntity getSearch() {
        return this.search;
    }

    public void setSearch(SearchEntity search) {
        this.search = search;
    }

    public CategoryProduct_Entity getCategory_Product() {
        return this.Category_Product;
    }

    public void setCategory_Product(CategoryProduct_Entity Category_Product) {
        this.Category_Product = Category_Product;
    }

    public PricesEntity getPrices() {
        return this.Prices;
    }

    public void setPrices(PricesEntity Prices) {
        this.Prices = Prices;
    }

    public StorageEntity getStorage() {
        return this.Storage;
    }

    public void setStorage(StorageEntity Storage) {
        this.Storage = Storage;
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
