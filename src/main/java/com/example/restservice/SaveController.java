package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveController {

    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/save")
    public Abigail abigail(@RequestParam(value = "gift", defaultValue = "Diamond") String gift) {
        return new Abigail(counter.incrementAndGet(), String.format(template, gift));
    }

//    @GetMapping("/save/create")
//    public Greeting create(@RequestParam(value = "create", defaultValue = "New One") String newOne) {
//
//        return new Greeting(counter.incrementAndGet(), String.format(template, newOne));
//    }

}