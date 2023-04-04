//package com.tutorial.springpostgre.manytomany;
//
//import com.tutorial.springpostgre.manytomany.entity.Student;
//import com.tutorial.springpostgre.manytomany.entity.University;
//import com.tutorial.springpostgre.manytomany.repository.StudentRepository;
//import com.tutorial.springpostgre.manytomany.repository.UniversityRepository;
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
//    private final StudentRepository studentRepository;
//    private final UniversityRepository universityRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringPostgreApplication.class, args);
//    }
//
//    @Bean
//    public CommandLineRunner run() {
//        return args -> {
//            var uni1 = new University("BDU");
//            var uni2 = new University("BMU");
//            var uni3 = new University("ADNSU");
//
//            universityRepository.saveAll(List.of(uni1, uni2, uni3));
//            var student1 = new Student("Kanan", "Akhmadli", new Date());
//            student1.getUniversitys().add(uni1);
//            student1.getUniversitys().add(uni2);
//
//            var student2 = new Student("Cavid", "Memmedov", new Date());
//            student2.getUniversitys().add(uni3);
//            student2.getUniversitys().add(uni2);
//            student2.getUniversitys().add(uni1);
//
//            studentRepository.saveAll(List.of(student1, student2));
//        };
//    }
//
//}