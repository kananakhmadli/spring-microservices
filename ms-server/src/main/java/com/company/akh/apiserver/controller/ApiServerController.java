package com.company.akh.apiserver.controller;

import az.kapitalbank.atlas.lib.common.error.ServiceException;
import com.company.akh.apiserver.dto.ResponseDto;
import com.company.akh.apiserver.error.ErrorCodes;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.SocketTimeoutException;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api-server")
public class ApiServerController {

    @GetMapping(value = "/demo")
    public ResponseDto demo(@RequestParam(required = false) Long sleepTime,
                            @RequestParam(required = false) String exceptionName) throws Throwable {
        if (Objects.nonNull(sleepTime)) {
            Thread.sleep(sleepTime);
        }

        if (Objects.nonNull(exceptionName)) {
            if ("service".equals(exceptionName)) {
                throw ServiceException.of(ErrorCodes.CUSTOMER_NOT_FOUND, "Customer not found");
            } else if ("timeout".equals(exceptionName)) {
                var timoutHappened = new SocketTimeoutException("Timeout happened");
                throw new Exception(timoutHappened);
            } else if ("exception".equals(exceptionName)) {
                throw new Exception("Undefined exception happened");
            }
        }

        return new ResponseDto("Hello world");
    }

}