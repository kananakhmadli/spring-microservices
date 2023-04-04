package com.company.akh.apiclient.error;

import az.kapitalbank.atlas.lib.common.error.RestErrorResponse;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler(CallNotPermittedException.class)
    public RestErrorResponse handleCallNotPermittedException(CallNotPermittedException ex) {
        String uuid = UUID.randomUUID().toString();
        log.info("Service unavailable for a short time, uuid: {}, message: {}",
                uuid, ex.getMessage());
        return new RestErrorResponse(uuid,
                HttpStatus.SERVICE_UNAVAILABLE.name(),
                "Service unavailable for a short time");
    }

}