package com.camilogo1200.springboot.demo.starterapp.rest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {



    @GetMapping("/")
    public String sayHelloWorld(ApplicationContext ctx){


        return "";


    }

}
