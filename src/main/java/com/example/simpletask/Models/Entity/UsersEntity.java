package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "Usuarios")
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "Name",nullable = false)
    private String Name;

    @Column(name = "Email",nullable = false)
    private String Email;

    @Column(name = "Password",nullable = false)
    private String Password;

    @Column(name = "Phone",nullable = false)
    private String Phone;

    @Column(name = "Created_at")
    private Instant Created_at;

    @Column(name = "Updated_at")
    private Instant Updated_at;
}
