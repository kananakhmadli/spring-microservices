//package com.tutorial.springpostgre.embedded.test2;
//
//import com.tutorial.springpostgre.embedded.test2.entity.Contact;
//import com.tutorial.springpostgre.embedded.test2.entity.Users;
//import com.tutorial.springpostgre.embedded.test2.repository.UsersRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import java.util.Date;
//
//@EnableJpaRepositories
//@SpringBootApplication
//@RequiredArgsConstructor
//public class SpringPostgreApplication {
//
//    private final UsersRepository usersRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringPostgreApplication.class, args);
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
//            var user = new Users("Kanan", "Akhmadli", new Date(),new Contact("0999999", "kanan.akhamdli@gmail.com", "google.com"));
//
//            usersRepository.save(user);
//        };
//    }
//
//}