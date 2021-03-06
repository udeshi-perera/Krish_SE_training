package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.commons.model.project")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
