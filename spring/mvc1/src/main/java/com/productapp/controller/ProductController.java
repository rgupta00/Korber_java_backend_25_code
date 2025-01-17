package com.productapp.controller;

import com.productapp.model.entities.Product;
import com.productapp.model.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;

import java.math.BigDecimal;

@Controller
@AllArgsConstructor
public class ProductController {

    private final  ProductService productService;

    @PostConstruct
    public void init(){
//        productService.addProduct(new Product("Dell laptop",new BigDecimal(100000)));
//        productService.addProduct(new Product("laptop coolpad",new BigDecimal(1700)));
    }

    @GetMapping(path = "showall")
    public String showAll(ModelMap modelMap){
        modelMap.addAttribute("productList",productService.getAll());
        return  "showall";
    }

    //----------adding a product--ModelAndView vs ModelMap vs Model
    @GetMapping(path = "addproduct")
    public String showAddProduct(ModelMap model){
        model.addAttribute("product", new Product());//i am adding form object to the req scope
        return "addproduct";
    }
    //P->R->G or double form submission problem?
    @PostMapping(path = "addproduct")
    public String AddProduct(@Valid @ModelAttribute(name = "product") Product product,
                             BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addproduct";
        }else {
                int id = product.getId();
                if (id == 0) {
                    productService.addProduct(product);
                } else {
                    productService.updateProduct(id, product);
                }
                return "redirect:showall";
        }
    }

    @GetMapping(path = "update")
    public String showUpdateProduct(@RequestParam(name = "id") int id, ModelMap modelMap){
        Product product=  productService.getProductById(id);
        modelMap.addAttribute("product",product);
        return "addproduct";
    }



    //@PathVaraible and @RequestParam
    @GetMapping(path = "delete")
    public String deleteProduct(@RequestParam(name = "id") int id){
        productService.deleteProduct(id);
        return "redirect:showall";
    }

}
