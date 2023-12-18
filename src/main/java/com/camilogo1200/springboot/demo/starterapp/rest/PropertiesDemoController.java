package com.camilogo1200.springboot.demo.starterapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;

@RestController("/demo/properties")
public class PropertiesDemoController {


    @Autowired
    private Environment environment;


}
