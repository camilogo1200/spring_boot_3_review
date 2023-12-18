package com.camilogo1200.springboot.demo.starterapp.beans;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:custom-values-file.properties")
public class CustomValuesFileAppConfiguration { }
