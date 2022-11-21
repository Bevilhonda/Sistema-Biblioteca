package com.example.demo;

import com.example.demo.repository.ExchangeRepository;
import com.example.demo.repository.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired private ExchangeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "id") String name) {
        Tutorial tutorial = repository.getTutorial(2);

        return tutorial.toString();
    }
}
