package com.company.akh.apiclient.client;

import com.company.akh.apiclient.client.model.ResponseDto;
import az.kapitalbank.atlas.lib.common.config.ContextRequestInterceptor;
import az.kapitalbank.atlas.lib.common.error.ServiceException;
import feign.Logger;
import feign.RequestInterceptor;
import feign.codec.ErrorDecoder;
import feign.error.AnnotationErrorDecoder;
import feign.error.ErrorCodes;
import feign.error.ErrorHandling;
import feign.jackson.JacksonDecoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.SocketTimeoutException;

@FeignClient(
        name = "api-server",
        url = "${service.api-server.url}",
        configuration = ApiServer.FeignConfiguration.class)
public interface ApiServer {

    @ErrorHandling(defaultException = ServiceException.class,
            codeSpecific = {
                    @ErrorCodes(codes = {500, 501, 502, 503}, generate = Exception.class),
                    @ErrorCodes(codes = 400, generate = ServiceException.class),
                    @ErrorCodes(codes = 504, generate = SocketTimeoutException.class)
            })
    @GetMapping("/api-server/demo")
    ResponseDto demo(@RequestParam("sleepTime") Long sleepTime,
                     @RequestParam("exceptionName") String exceptionName);

    class FeignConfiguration {

        @Bean
        Logger.Level feignLoggerLevel() {
            return Logger.Level.FULL;
        }

        @Bean
        public ErrorDecoder feignErrorDecoder() {
            return AnnotationErrorDecoder.builderFor(ApiServer.class)
                    .withResponseBodyDecoder(new JacksonDecoder()).build();
        }

        @Bean
        public RequestInterceptor requestInterceptor() {
            return new ContextRequestInterceptor();
        }
    }

}