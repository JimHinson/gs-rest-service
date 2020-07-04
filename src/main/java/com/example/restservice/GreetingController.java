package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/karen")
	public Greeting karen(@RequestParam(value = "karen", defaultValue = "Karen") String karen) {
		return new Greeting(counter.incrementAndGet(), String.format(template, karen));
	}

	@GetMapping("/karen/jim")
	public Greeting jim(@RequestParam(value = "jim", defaultValue = "Jim") String jim) {

		return new Greeting(counter.incrementAndGet(), String.format(template, jim));
	}


}
