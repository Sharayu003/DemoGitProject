package com.productservice.product.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import  jakarta.persistence.Id;
import  jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter


public class BaseModels {
    @Id


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
