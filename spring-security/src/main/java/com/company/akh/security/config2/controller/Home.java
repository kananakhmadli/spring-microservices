//package com.company.akh.security.config2.controller;
//
//import com.company.akh.security.config2.entity.Person;
//import com.company.akh.security.config2.repository.PersonRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/security")
//@RequiredArgsConstructor
//public class Home {
//
//    private final PersonRepository personRepository;
//
//    @GetMapping("/home")
//    public String home() {
//        return "Hello form spring home";
//    }
//
//    @GetMapping("/dashboard")
//    public List<Person> dashboard() {
//        return personRepository.findAll();
//    }
//
//    @GetMapping("/dashboard1")
//    public Person dashboard1() {
//        return personRepository.findByUserName("kanan");
//    }
//
//}