package com.productapp.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@AllArgsConstructor

@Entity
@Table(name = "product")

public class Product {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    private String name;
    private BigDecimal price;
    private BigDecimal discountedPrice;
    private String discountCoupon;

    public Product() {
    }

    public Product(String name, BigDecimal price, BigDecimal discountedPrice, String discountCoupon) {
        this.name = name;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountCoupon = discountCoupon;
    }
}
