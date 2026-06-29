package com.example.app3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello from App3";
    }

    @GetMapping("/health")
    public String health() {
        return "APP3 UP";
    }
}