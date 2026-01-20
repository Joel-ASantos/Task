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
    @JoinColumn(name = "UsersFk",referencedColumnName = "UserId")
    private UsersEntity Users;

    @Column(name = "SearchTerm")
    private String SearchTerm;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    public String getSearch_Id() {
        return this.Search_Id;
    }

    public void setSearch_Id(String Search_Id) {
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

}
