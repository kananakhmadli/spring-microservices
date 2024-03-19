package com.company.akh.dcokerization.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/home")
public class Home {

    @GetMapping
    public String home() {
        log.info("home method is called");
        return "Hello docker form spring image";
    }

}