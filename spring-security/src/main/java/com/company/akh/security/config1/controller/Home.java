package com.company.akh.security.config1.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class Home {

    @GetMapping("/home")
    public String home() {
        log.info("home method is called");
        return "Hello form spring home";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        log.info("dashboard method is called");
        return "Hello form spring dashboard";
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserRequest {

        private String password;
        private String username;
    }

}