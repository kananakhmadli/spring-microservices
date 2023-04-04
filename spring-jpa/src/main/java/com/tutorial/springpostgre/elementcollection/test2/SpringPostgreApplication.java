//package com.tutorial.springpostgre.elementcollection.test2;
//
//import com.tutorial.springpostgre.elementcollection.test2.entity.Users;
//import com.tutorial.springpostgre.elementcollection.test2.repository.UsersRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
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
//            var user1 = new Users("Kanan", "Akhmadli");
//            user1.getNumbers().put("Phone", "4444444");
//            user1.getNumbers().put("Home", "55555555");
//            user1.getNumbers().put("Work", "6666666");
//
//            usersRepository.save(user1);
//        };
//    }
//
//}