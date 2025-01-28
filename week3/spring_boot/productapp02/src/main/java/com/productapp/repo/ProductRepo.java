package com.productapp.repo;

import com.productapp.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

//i am declareing the dao layer :)

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
//    @Query("select p from Product p")
//    public List<Product> getAll();

    public Product findByName(String name);
    public Product findByNameLike(String name);
    public Product findByNameStartingWith(String name);
    public Product findByPriceOrName(BigDecimal price, String name);
}
