package com.example.simpletask.Models.Entity;

import java.time.Instant;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Pesquisa")
public class SearchEntity {

    @Id
    @Column(name = "Search_Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Search_Id;

    @ManyToOne
    @JoinColumn(name = "Users_Fk",referencedColumnName = "id",nullable = false)
    private UsersEntity Users;

    @Column(name = "SearchTerm")
    private String SearchTerm;

    @Column(name = "Created_at")
    private Instant created_at;

}
