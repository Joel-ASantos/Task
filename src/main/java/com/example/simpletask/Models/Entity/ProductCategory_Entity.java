package com.example.simpletask.Models.Entity;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Categoria_Produto")
public class ProductCategory_Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL)
    private CategoryEntity category;
    
    @ManyToMany(cascade = CascadeType.ALL)
    private ProductsEntity product;
}
