package com.productservice.products.dtos;

import com.productservice.products.models.Product;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ProductResponseSelf {

    private Product product;
    private HttpStatus status;
    private String messege;
}
