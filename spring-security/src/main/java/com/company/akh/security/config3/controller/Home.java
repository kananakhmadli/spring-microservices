//package com.company.akh.security.config3.controller;
//
//import com.company.akh.security.config3.entity.Person;
//import com.company.akh.security.config3.repository.PersonRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
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
//    private final AuthenticationManager authenticationManager;
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
//    @GetMapping("/auth")
//    public void auth(@RequestBody com.company.akh.security.config1.controller.Home.UserRequest request) {
//        authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        request.getUsername(),
//                        request.getPassword()));
//    }
//
//}