package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String greetings(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getRemoteAddr();
    }
}
