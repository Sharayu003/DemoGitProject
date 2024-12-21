package com.firstproject.springinto.Controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter

public class Employee {
    private String name;
    private String email;
    private int salary;

}
