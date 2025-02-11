package com.productapp.integeration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productapp.repo.Product;
import com.productapp.repo.ProductRepo;
import com.productapp.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProductAppIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    void setup(){
        productRepo.deleteAll();
    }

    @Test
    public void givenProductObject_whenCreateProduct_thenReturnSavedProduct() throws Exception{

        // given - precondition or setup
        Product product = Product.builder()
                .name("watch")
                .price(7000)
                .build();

        // when - action or behaviour that we are going test
        ResultActions response = mockMvc.perform(post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(product)));

        // then - verify the result or output using assert statements
        response.andDo(print()).
                andExpect(status().isCreated())
                .andExpect(jsonPath("$.name",
                        is(product.getName())))
                .andExpect(jsonPath("$.price",
                        is(product.getPrice())));


    }

    @Test
    public void givenListOfProducts_whenGetAllProducts_thenReturnProductList() throws Exception{
        // given - precondition or setup
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(Product.builder().name("foo").price(7000).build());
        listOfProducts.add(Product.builder().name("bar").price(7000).build());
        productRepo.saveAll(listOfProducts);
        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products"));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(listOfProducts.size())));

    }

    // positive scenario - valid employee id
    // JUnit test for GET employee by id REST API
    @Test
    public void givenProductId_whenGetProductById_thenReturnProducteObject() throws Exception{
        // given - precondition or setup
        Product product = Product.builder()
                .name("watch")
                .price(7000)
                .build();
        productRepo.save(product);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products/{id}", product.getId()));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.name", is(product.getName())))
                .andExpect(jsonPath("$.price", is(product.getPrice())));

    }



    // JUnit test for delete employee REST API
    @Test
    public void givenProductId_whenDeleteProduct_thenReturn200() throws Exception{
        // given - precondition or setup
        Product product = Product.builder()
                .name("watch")
                .price(7000)
                .build();
        productRepo.save(product);
        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(delete("/products/{id}", product.getId()));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print());
    }
}
