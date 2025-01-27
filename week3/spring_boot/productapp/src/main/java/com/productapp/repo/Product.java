package com.productapp.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

}
