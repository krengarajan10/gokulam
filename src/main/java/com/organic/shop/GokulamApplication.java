package com.organic.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Rengarajan on 3/25/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.organic.shop")
public class GokulamApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        System.out.println("Welcome to Gokulam");
        SpringApplication.run(GokulamApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
        return springApplicationBuilder.sources(this.getClass());
    }
}
