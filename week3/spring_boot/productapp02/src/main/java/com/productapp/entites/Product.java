package com.productapp.entites;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "product_table_boot")
public class Product {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "{product.name.absent}")
    @Column(name = "product_name")
    private String name;

    @NotNull(message = "{product.price.absent}")
    @Range(min = 10, max = 100000, message = "{product.price.invalid}")
    @Column(name = "product_price")
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
