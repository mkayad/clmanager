package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Value("${name}")
    public String name;
    @GetMapping("/list")
    public String index(){
        System.out.println("Application with current profile 2"+name);
        return "index";
    }
}
