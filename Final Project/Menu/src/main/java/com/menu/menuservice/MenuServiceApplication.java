package com.menu.menuservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("commonproject.model.menu")
public class MenuServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuServiceApplication.class, args);
    }

}
