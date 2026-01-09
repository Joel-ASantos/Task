package com.example.simpletask.Models.Entity;
import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import java.util.Date;

@Entity
@Table(name = "Users")
public class UsersEntity {

    @Id
    @Column(name = "User_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String User_Id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Email")
    private String Email;

    @Column(name = "Password")
    private String Password;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updated_at;
}
