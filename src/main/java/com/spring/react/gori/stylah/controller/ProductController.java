package com.spring.react.gori.stylah.controller;

import com.spring.react.gori.stylah.model.Product;
import com.spring.react.gori.stylah.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping("/products")
    private Long saveProduct(@RequestBody Product product){
        productService.saveOrUpdate(product);

        return product.getProductId();
    }

    @GetMapping("/products/{productId}")
    private Product getProductById(@PathVariable("productId") Long id){
        return productService.getProductById(id);
    }

    @GetMapping("/products")
    private List<Product> getProducts(){
        return productService.findAll();
    }

    @PutMapping("/products")
    private Product update(@RequestBody Product product){
        productService.saveOrUpdate(product);
        return product;
    }

    @DeleteMapping("/products/{productId}")
    private void deleteProduct(@PathVariable("productId") Long id){
        productService.delete(id);
    }

}
