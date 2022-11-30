package com.example.day14springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Day14SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day14SpringMvcApplication.class, args);
    }

}
