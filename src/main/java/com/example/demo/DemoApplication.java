package com.example.demo;

import com.example.demo.repository.AutorRepository;
import com.example.demo.repository.AutorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired private AutorRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "id") String name) {
        AutorEntity tutorial = repository.getAutor(2);

        return tutorial.toString();
    }
}
