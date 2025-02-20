package com.code.rahul.spring_boot_cicd.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "Welcome to Tech soft !!";
    }
}
