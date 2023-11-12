package com.example.demohelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

	private final GreetingRepository greetingRepository;

	public HelloWorldController(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@GetMapping("/hello")
	public List<Greeting> helloWorld() {
		return greetingRepository.findAll();
	}
}
