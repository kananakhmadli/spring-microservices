package com.company.akh.postgres.logging;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class LoggingAspect {

//    private final Environment env;

    @Before("execution(* com.tutorial.springpostgre.service.*.*())")
    public void beforeCalling(JoinPoint joinPoint) {
        log.warn("Before ,argumenets-->{}",joinPoint.getArgs());
    }

    @After("execution(* com.tutorial.springpostgre.service.*.*())")
    public void afterCalling(JoinPoint joinPoint) {
        log.warn("After ,argumenets-->{}",joinPoint.getArgs());
    }

}