package me.madhushankar.image.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
public class ImageApplication {
    @Resource
    public static void main(String[] args) {
        SpringApplication.run(ImageApplication.class, args);
    }
}
