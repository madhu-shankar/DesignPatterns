package me.madhushankar.price.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class PriceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PriceApplication.class, args);
    }
}
