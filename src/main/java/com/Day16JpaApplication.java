package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com.entity")
@EnableJpaRepositories("com.dal")
@EnableEurekaClient
public class Day16JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day16JpaApplication.class, args);
    }

}
