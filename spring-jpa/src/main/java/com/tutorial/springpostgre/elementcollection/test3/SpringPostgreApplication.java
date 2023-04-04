//package com.tutorial.springpostgre.elementcollection.test3;
//
//import com.tutorial.springpostgre.elementcollection.test3.entity.PhoneType;
//import com.tutorial.springpostgre.elementcollection.test3.entity.Users;
//import com.tutorial.springpostgre.elementcollection.test3.repository.UsersRepository;
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
//            user1.getNumbers().put(PhoneType.CELL, "121212121");
//            user1.getNumbers().put(PhoneType.HOME, "232323232");
//            user1.getNumbers().put(PhoneType.WORK, "454545454");
//            user1.getNumbers().put(PhoneType.ADDITIONAL, "5656565656");
//
//            usersRepository.save(user1);
//        };
//    }
//
//}