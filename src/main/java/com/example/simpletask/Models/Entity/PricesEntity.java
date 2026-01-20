package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
@Table(name = "Prices")
public class PricesEntity {

    @Id
    @Column(name = "PricesId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String PricesId;

    @Column(name = "Value")
    private Float Value;

    @Timestamp
    @Column(name = "CreatedAt")
    private Date created_at;

    @Timestamp
    @Column(name = "UpdatedAt")
    private Date updated_at;

    public String getPricesId() {
        return this.PricesId;
    }

    public void setPricesId(String PricesId) {
        this.PricesId = PricesId;
    }

    public Float getValue() {
        return this.Value;
    }

    public void setValue(Float Value) {
        this.Value = Value;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
