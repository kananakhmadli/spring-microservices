//package com.tutorial.springpostgre.onetomanyrefactory;
//
//import com.tutorial.springpostgre.onetomanyrefactory.entity.Product;
//import com.tutorial.springpostgre.onetomanyrefactory.entity.Users;
//import com.tutorial.springpostgre.onetomanyrefactory.repository.ProductRepository;
//import com.tutorial.springpostgre.onetomanyrefactory.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import java.util.Date;
//import java.util.List;
//
//@EnableJpaRepositories
//@SpringBootApplication
//@RequiredArgsConstructor
//public class SpringPostgreApplication {
//
//    private final ProductRepository productRepository;
//    private final UserRepository userRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringPostgreApplication.class, args);
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
//            Users user = new Users("Huseyin", "Huseyinli", new Date());
//
//            var product1 = new Product("Iphone", 2500, 2, new Date());
//            product1.setUser(user);
//            var product2 = new Product("A3", 200, 1, new Date());
//            product2.setUser(user);
//
//            userRepository.save(user);
//            productRepository.saveAll(List.of(product1, product2));
//        };
//    }
//
//}