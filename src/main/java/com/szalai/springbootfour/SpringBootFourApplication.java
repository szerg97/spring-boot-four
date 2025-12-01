package com.szalai.springbootfour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.resilience.annotation.EnableResilientMethods;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(basePackages = "com.szalai")
@EnableResilientMethods
public class SpringBootFourApplication {

    static void main(String[] args) {
        SpringApplication.run(SpringBootFourApplication.class, args);
    }

    @Retryable(
            maxRetries = 3,
            delay = 2000,
            multiplier = 2,
            includes = IllegalStateException.class
    )
    public String foo() {
        return "bar";
    }
}
