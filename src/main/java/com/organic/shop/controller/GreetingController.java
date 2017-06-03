package com.organic.shop.controller;

import com.organic.shop.view.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Rengarajan on 3/31/2017.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping("/greeting")
    public Greetings greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("Inside greetings");
        return new Greetings(counter.incrementAndGet(),
                String.format(template, name));
    }


}
