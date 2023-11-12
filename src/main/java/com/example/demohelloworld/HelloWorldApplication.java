package com.example.demohelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(GreetingRepository greetingRepository) {
        return (args) -> {
            // 초기 데이터 추가
            greetingRepository.save(new Greeting("Hello, World!"));
        };
    }
}

