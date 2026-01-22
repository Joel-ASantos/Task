package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Users")
public class UsersEntity {

    @Id
    @Column(name = "UserId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UserId;

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

    public Long getUserId() {
        return this.UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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
