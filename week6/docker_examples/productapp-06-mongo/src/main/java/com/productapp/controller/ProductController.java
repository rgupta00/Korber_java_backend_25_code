package com.productapp.controller;

import com.productapp.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("products")
    public ModelAndView allProducts(ModelAndView mv) {
        mv.setViewName("products");
        mv.addObject("products", productService.getAll());

        return mv;
    }
}
