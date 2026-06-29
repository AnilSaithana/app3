package com.example.app2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello from App2";
    }

    @GetMapping("/health")
    public String health() {
        return "APP2 UP";
    }
}