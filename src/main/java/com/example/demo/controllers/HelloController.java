package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloController {


    @GetMapping("/hello")
    public ResponseEntity<?> getHello () {
        return ResponseEntity.ok("Hello World");
    }



}
