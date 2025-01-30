package com.productapp.repo;

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


public class Product {
    private int id;

    @NotEmpty(message = "{product.name.absent}")
    private String name;

    @NotNull(message = "{product.price.absent}")
    @Range(min = 100, max = 100000, message = "{product.price.invalid}")
    private BigDecimal price;

}
