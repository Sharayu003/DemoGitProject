package com.productservice.product.service;

import com.productservice.product.models.Product;
import org.springframework.stereotype.Service;

@Service
public interface IProductService {
    Product getSingleProduct(Long id);
}
