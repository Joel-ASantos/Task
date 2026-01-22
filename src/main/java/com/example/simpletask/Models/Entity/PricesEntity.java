package com.example.simpletask.Models.Entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "Prices")
public class PricesEntity {

    @Id
    @Column(name = "PricesId",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PricesId;

    @Column(name = "Value",nullable = false)
    private Float Value;

    @Column(name = "CreatedAt",nullable = false)
    private Instant created_at;

    @Column(name = "UpdatedAt",nullable = true)
    private Instant updated_at;

    public Long getPricesId() {
        return this.PricesId;
    }

    public void setPricesId(Long PricesId) {
        this.PricesId = PricesId;
    }

    public Float getValue() {
        return this.Value;
    }

    public void setValue(Float Value) {
        this.Value = Value;
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
