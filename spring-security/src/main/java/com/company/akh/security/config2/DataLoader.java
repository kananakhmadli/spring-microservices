//package com.company.akh.security.config2;
//
//import com.company.akh.security.config2.entity.Person;
//import com.company.akh.security.config2.entity.Role;
//import com.company.akh.security.config2.repository.PersonRepository;
//import com.company.akh.security.config2.repository.RoleRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import java.util.List;
//
//@Component
//@RequiredArgsConstructor
//public class DataLoader
////        implements ApplicationRunner
//{
//
//    private final PersonRepository personRepository;
//    private final RoleRepository roleRepository;
//    private final PasswordEncoder passwordEncoder;
//
////    @Override
////    public void run(ApplicationArguments args) {
////       loadData();
////    }
//
//    @PostConstruct
//    public void init() {
//        loadData();
//    }
//
//    private void loadData() {
//        var admin = new Role();
//        admin.setName("ROLE_ADMIN");
//
//        var user = new Role();
//        user.setName("ROLE_USER");
//
//        roleRepository.saveAll(List.of(admin, user));
//
//        Person person1 = new Person();
//        person1.setUserName("kanan");
//        person1.setPassword(passwordEncoder.encode("1234"));
//        person1.setRoles(List.of(admin));
//
//        Person person2 = new Person();
//        person2.setUserName("user");
//        person2.setPassword(passwordEncoder.encode("1234"));
//        person2.setRoles(List.of(user));
//        personRepository.saveAll(List.of(person1, person2));
//
//        System.out.println("finshed");
//    }
//
//}