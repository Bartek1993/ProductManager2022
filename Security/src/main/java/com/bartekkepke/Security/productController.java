package com.bartekkepke.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class productController {
    @Autowired
    productsinterface productservice;

    @RequestMapping("/products")
    @GetMapping
    public String getProducts(Model productModel)
    {
        List<Products> products = productservice.findAll();
        productModel.addAttribute("products", products );
        return "products";
    }

    @RequestMapping("/product/new")
    @GetMapping
    public String AddProduct(Model productModel)
    {
        productModel.addAttribute("products", new Products());
        return "addproduct";
    }


    @PostMapping("/products/save")
    public String SaveUserAction(Products products)
    {
        productservice.save(products);
        return "redirect:/products";
    }

}
