package com.firstproject.springinto.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/greet")
    public String sayHello(){
        return "Hello, Good Mornging!";

    }
    @GetMapping("/Bye")
    public String sayBye(){
        return "Bye Bye!";

    }
    @GetMapping("/greet1")
    public String greeting(@RequestParam("name") String name){
        return "clearing many concepts, Nice Class "+name;
    }
    @PostMapping("/create/something")
    public Integer postExample(@RequestBody Employee employee){
        return employee.getSalary();
    }


}

