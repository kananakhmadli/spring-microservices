package com.company.akh.security.jwt.controller;

import com.company.akh.security.jwt.dto.LoginRequest;
import com.company.akh.security.jwt.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Slf4j
@RestController
@RequestMapping("/security")
@RequiredArgsConstructor
public class SecurityController {

    private final JwtUtil jwtUtil;
    private final AuthenticationManager authenticationManager;

    @PostMapping("login")
    public String login(@RequestBody LoginRequest request) {
        var token = new UsernamePasswordAuthenticationToken(
                request.getUsername(), request.getPassword(), new ArrayList<>());
        authenticationManager.authenticate(token);
        return jwtUtil.generate(request.getUsername());
    }

    @GetMapping("/hello")
    public String get() {
        return "Hello";
    }

}