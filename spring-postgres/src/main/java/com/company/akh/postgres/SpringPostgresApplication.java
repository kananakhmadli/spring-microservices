package com.company.akh.postgres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringPostgresApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringPostgresApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
        };
    }

    @Override
    public void run(String... args) {
    }

}