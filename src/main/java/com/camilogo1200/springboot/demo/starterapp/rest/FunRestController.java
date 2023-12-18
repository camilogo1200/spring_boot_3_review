package com.camilogo1200.springboot.demo.starterapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHelloWorld(){
        return "hi there!";
    }

}
