package com.productservice.products.controllers;

import com.productservice.products.dtos.ProductRequestDto;
import com.productservice.products.models.Category;
import com.productservice.products.models.Product;
import com.productservice.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    IProductService productService;
    @GetMapping("/products")
    public List<Product> getAllProducts(){

        return productService.getAllProduct();
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getSingleProducts(@PathVariable("id") Long id){

        Product product;

        try {
            product = productService.getSingleProduct(id);
        }catch(Exception e){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(product, HttpStatus.OK);


    }

    @GetMapping("/products/categories")
    public List<Category> getAllCategories(){

        return new ArrayList<>();
    }

    @GetMapping("/products/category/{id}")
    public List<Product> getAllProductInCategory(){

        return productService.getAllProduct();
    }

    @GetMapping("/products/category/{id}")
    public List<Product> getAllProductInCategory(@PathVariable("id") Long id){

        return new ArrayList<>();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody ProductRequestDto requestDto){
        return new Product();
    }

    @PatchMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id,
                                 @RequestBody ProductRequestDto requestDto){
        return new Product();
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id){
        return true;
    }


}
