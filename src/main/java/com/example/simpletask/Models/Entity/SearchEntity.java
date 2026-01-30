package com.example.simpletask.Models.Entity;

import java.time.Instant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Search")
public class SearchEntity {

    @Id
    @Column(name = "Search_Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Search_Id;

    @ManyToOne
    @JoinColumn(name = "UsersFk",referencedColumnName = "UserId",nullable = false)
    private UsersEntity Users;

    @Column(name = "SearchTerm",nullable = false)
    private String SearchTerm;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

}
