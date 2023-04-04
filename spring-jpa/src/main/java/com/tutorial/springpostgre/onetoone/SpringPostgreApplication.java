//package com.tutorial.springpostgre.onetoone;
//
//import com.tutorial.springpostgre.onetoone.entity.Address;
//import com.tutorial.springpostgre.onetoone.entity.Customer;
//import com.tutorial.springpostgre.onetoone.repository.AddressRepository;
//import com.tutorial.springpostgre.onetoone.repository.CustomerRepository;
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
//    private final AddressRepository addressRepository;
//    private final CustomerRepository customerRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringPostgreApplication.class, args);
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
//            var customer1 = new Customer("Kanan", "Akhmadli");
//            var address1 = new Address("Yasamal", "Baku", 121212);
//            customer1.setAddress(address1);
//
//            customerRepository.save(customer1);
//        };
//    }
//
//}