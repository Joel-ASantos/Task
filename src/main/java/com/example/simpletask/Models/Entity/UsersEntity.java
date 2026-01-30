package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
@Entity
@Table(name = "Users")
public class UsersEntity {

    @Id
    @Column(name = "UserId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer UserId;

    @Column(name = "Name",nullable = false)
    private String Name;

    @Column(name = "Email",nullable = false)
    private String Email;

    @Column(name = "Password",nullable = false)
    private String Password;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

}
