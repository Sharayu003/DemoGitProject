package com.productservice.products.models;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends Basemodel{
    private String description;
    private String image;
    private float price;

    @ManyToOne
    private Category category;
}
