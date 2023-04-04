package com.company.akh.apiclient.config;

import com.company.akh.apiclient.client.ApiServer;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(clients = ApiServer.class)
public class FeignClientConfiguration {
}