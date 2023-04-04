//package com.tutorial.springpostgre.manytomany.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.SequenceGenerator;
//import java.util.List;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class University {
//
//    @Id
//    @SequenceGenerator(name = "seq_uni", allocationSize = 1)
//    @GeneratedValue(generator = "seq_uni", strategy = GenerationType.SEQUENCE)
//    private Long universityId;
//    private String name;
//
//    @ManyToMany(mappedBy = "universitys")
//    private List<Student> students;
//
//    public University(String name) {
//        this.name = name;
//    }
//
//}