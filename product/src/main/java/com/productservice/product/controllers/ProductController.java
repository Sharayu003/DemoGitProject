package com.productservice.product.controllers;

import com.productservice.product.dtos.ProductRequestDto;
import com.productservice.product.models.Product;
import com.productservice.product.service.FakeStoreProductService;
import com.productservice.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return new ArrayList<>();
    }

    @GetMapping("/products/{id}")
    public Product getSingleProducts(){
        return productService.getSingleProduct(id);
    }

    @GetMapping("/products/Category")
    public List<Category> getAllCategories(){
        return new ArrayList<>();
    }

    @GetMapping("/products/Category/{id}")
    public List<Product> getAllProductsInCategory(@PathVariable("id") Long id){
        return new ArrayList<>();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody ProductRequestDto requestDto){
        return new Product();
    }

    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody ProductRequestDto requestDto){
        return  new Product();
    }

    @DeleteMapping("/product/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id){
        return true;
    }

}
