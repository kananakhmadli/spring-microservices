package com.company.akh.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/home")
    public ResponseEntity<String> home() {
        return ResponseEntity.ok().body("Application is working");
    }

}