package com.company.akh.apiclient.controller;

import az.kapitalbank.atlas.lib.limiter.annotation.RateLimiter;
import com.company.akh.apiclient.client.ApiServer;
import com.company.akh.apiclient.client.model.ResponseDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-client")
@RequiredArgsConstructor
public class ApiClientController {

    private final ApiServer client;

    @RateLimiter(name = "demo")
    @CircuitBreaker(name = "demo")
    @GetMapping(value = "/demo")
    public ResponseDto demo(@RequestParam(required = false) Long sleepTime,
                            @RequestParam(required = false) String exceptionName) {
        return client.demo(sleepTime, exceptionName);
    }

}