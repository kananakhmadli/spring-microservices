//package com.tutorial.springpostgre.onetowmany;
//
//import com.tutorial.springpostgre.onetowmany.entity.Product;
//import com.tutorial.springpostgre.onetowmany.entity.Users;
//import com.tutorial.springpostgre.onetowmany.repository.ProductRepository;
//import com.tutorial.springpostgre.onetowmany.repository.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import java.util.Arrays;
//import java.util.Date;
//
//@EnableJpaRepositories
//@SpringBootApplication
//@RequiredArgsConstructor
//public class SpringPostgreApplication {
//
//	private final ProductRepository productRepository;
//	private final UserRepository userRepository;
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringPostgreApplication.class, args);
//	}
//
//	@Bean
//	public CommandLineRunner run() {
//		return args -> {
//
//			Users user = new Users("Huseyin", "Huseyinli", new Date());
//
//			Product product1 = new Product("Iphone", 2500, 2, new Date());
//			Product product2 = new Product("A3", 200, 1, new Date());
//			var products = Arrays.asList(product1, product2);
//
//			user.setProducts(products);
//			userRepository.save(user);
//			productRepository.saveAll(products);
//		};
//	}
//    // 3 dənə table yaranır
//
//}