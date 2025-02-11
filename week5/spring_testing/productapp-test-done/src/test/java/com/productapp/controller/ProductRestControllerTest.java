package com.productapp.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ProductRestController.class)
class ProductRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void givenProductObject_whenCreateProduct_thenReturnSavedProduct() throws Exception{

        // given - precondition or setup
        Product product=new Product("laptop", 120000);
        given(productService.addProduct(any(Product.class)))
                .willAnswer((invocation)-> invocation.getArgument(0));

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
        listOfProducts.add(Product.builder().name("a").price(6000).build());
        listOfProducts.add(Product.builder().name("b").price(6000).build());
        given(productService.getAll()).willReturn(listOfProducts);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products"));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.size()",
                        is(listOfProducts.size())));

    }

    // positive scenario - valid product id
    @Test
    public void givenProductId_whenGetProductById_thenReturnProductObject() throws Exception{
        // given - precondition or setup
        int productId = 1;
        Product product=new Product(1,"laptop", 120000);
        given(productService.getById(productId)).willReturn(product);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products/{id}", productId));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.name", is(product.getName())))
                .andExpect(jsonPath("$.price", is(product.getPrice())));

    }


    // @Test
    public void givenInvalidProductId_whenGetProductById_thenReturnEmpty() throws Exception{
        // given - precondition or setup
        int productId = 1;
        Product product=new Product(1,"laptop", 120000);
        given(productService.getById(productId)).willReturn(null);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(get("/products/{id}", productId));

        // then - verify the output
        response.andExpect(status().isNotFound())
                .andDo(print());

    }

    // JUnit test for delete employee REST API
    @Test
    public void givenProductId_whenDeleteProduct_thenReturn200() throws Exception{
        // given - precondition or setup
        int productId = 1;
        willDoNothing().given(productService).deleteProduct(productId);

        // when -  action or the behaviour that we are going test
        ResultActions response = mockMvc.perform(delete("/products/{id}", productId));

        // then - verify the output
        response.andExpect(status().isOk())
                .andDo(print());
    }
}