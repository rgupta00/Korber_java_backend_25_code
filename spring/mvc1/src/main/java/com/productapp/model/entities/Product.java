package com.productapp.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "new_pr_table")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "name can not be blank")
    @Column(length = 20, nullable = false)
    private String name;

    //DataAccessExeption -> wrapper
    //persistenceexceptiontranslationpostprocessor

    @NotNull(message = "price can not be null")
    @Min(value = 10, message =  "min price should be more then 10")
    @Max(value = 1000000, message =  "min price should be more then 1000000")
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
