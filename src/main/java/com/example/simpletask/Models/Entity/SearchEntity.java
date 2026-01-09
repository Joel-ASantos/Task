package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "Search")
public class SearchEntity {

    @Id
    @Column(name = "Search_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String Search_Id;

    @ManyToOne
    @JoinColumn(name = "Users_Id",referencedColumnName = "User_Id")
    private UsersEntity Users;

    @Column(name = "SearchTerm")
    private String SearchTerm;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;
}
