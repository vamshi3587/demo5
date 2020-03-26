package com.example.demo5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ExampleOne {
    @GetMapping("hi")
    public String a(){
        return "vamshi";
    }
}

