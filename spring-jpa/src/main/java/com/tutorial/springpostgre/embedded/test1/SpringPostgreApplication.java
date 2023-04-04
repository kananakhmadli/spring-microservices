//package com.tutorial.springpostgre.embedded.test1;
//
//import com.tutorial.springpostgre.embedded.test1.entity.Address;
//import com.tutorial.springpostgre.embedded.test1.entity.Users;
//import com.tutorial.springpostgre.embedded.test1.repository.UsersRepository;
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
//            var user = new Users("Kanan", "Akhmadli", new Date());
//            user.getAddresses().add(new Address("Bakixanov", "Xatinli", "Tovuz", 5555));
//            user.getAddresses().add(new Address("Nermanov", "Nizami", "Baki", 4444));
//
//            usersRepository.save(user);
//        };
//    }
//
//}