package com.nfb.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot E-commerce API is running! Try /api to see available endpoints.";
    }
    
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}