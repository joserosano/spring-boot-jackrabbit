package com.jose.springbootjackrabbit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class SpringBootJackrabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJackrabbitApplication.class, args);
    }
}
