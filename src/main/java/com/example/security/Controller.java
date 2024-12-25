package com.example.security;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @GetMapping("/")
    public String greet(HttpServletRequest request) {
        return "Welcome to the application n/ " + request.getSession().getId();
    }
}
