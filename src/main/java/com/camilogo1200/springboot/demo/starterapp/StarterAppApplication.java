package com.camilogo1200.springboot.demo.starterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarterAppApplication {

    public static void main(String[] args) {

        //auto fast start form
        //SpringApplication.run(StarterAppApplication.class, args);

        //if you need to customize something from app before run
        SpringApplication application = new SpringApplication(StarterAppApplication.class);

        /*
         *  If you don't want to add command line properties to be added to the Environment
         *  you can disable them by using setAddCommandLineProperties
         */
        //application.setAddCommandLineProperties(false);

        application.run(args);
    }

}
