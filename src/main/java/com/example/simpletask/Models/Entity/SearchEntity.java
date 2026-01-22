package com.example.simpletask.Models.Entity;

import java.time.Instant;
import jakarta.persistence.*;

@Entity
@Table(name = "Search")
public class SearchEntity {

    @Id
    @Column(name = "Search_Id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Search_Id;

    @ManyToOne
    @JoinColumn(name = "UsersFk",referencedColumnName = "UserId",nullable = false)
    private UsersEntity Users;

    @Column(name = "SearchTerm",nullable = false)
    private String SearchTerm;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    public Long getSearch_Id() {
        return this.Search_Id;
    }

    public void setSearch_Id(Long Search_Id) {
        this.Search_Id = Search_Id;
    }

    public UsersEntity getUsers() {
        return this.Users;
    }

    public void setUsers(UsersEntity Users) {
        this.Users = Users;
    }

    public String getSearchTerm() {
        return this.SearchTerm;
    }

    public void setSearchTerm(String SearchTerm) {
        this.SearchTerm = SearchTerm;
    }

    public Instant getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

}
