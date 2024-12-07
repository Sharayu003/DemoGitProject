package com.productservice.product.service;

import com.productservice.product.dtos.ProductRequestDto;
import com.productservice.product.dtos.ProductResponseDto;
import com.productservice.product.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements IProductService {
    RestTemplate restTemplate;
//    public FakeStoreProductService(){
//        restTemplate = new RestTemplate();
//    }

    @Override
    public Product getSingleProduct(Long id) {

        ProductResponsetDto response = restTemplate.getForObject("https://fakestoreapi.com/products" + id, ProductResponsetDto.class);

        return getProductFromResponseDTO(response);
    }

    private Product getProductFromResponseDTO(ProductResponseDto response){
        Product product = new Product();
        product.setId(response.getID());
        product.setName(response.getTitle());
        product.setDescription(response.getDescription());
        product.setPrice(response.getPrice());
        product.setCategory(new Category());
        product.getCategory().setName(response.getCategory());
        product.setImage(response.getImage());

        return product;
    }
}

