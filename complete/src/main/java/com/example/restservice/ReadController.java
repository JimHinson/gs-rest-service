package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadController {

    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/read/index")
    public Greeting read(@RequestParam(value = "index", defaultValue = "Get One") String getOne) {
//        new Greeting(counter.)
        return new Greeting(counter.incrementAndGet(), String.format(template, getOne));
    }

}