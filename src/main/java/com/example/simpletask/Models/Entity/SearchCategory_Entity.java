package com.example.simpletask.Models.Entity;

import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Busca_Categoria")
public class SearchCategory_Entity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL)
    private SearchEntity search;

    @ManyToOne(cascade = CascadeType.ALL)
    private CategoryEntity category;
}
