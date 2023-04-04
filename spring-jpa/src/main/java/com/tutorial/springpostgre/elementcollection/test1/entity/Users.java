//package com.tutorial.springpostgre.elementcollection.test1.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.SequenceGenerator;
//import java.util.ArrayList;
//import java.util.List;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Users {
//
//    @Id
//    @SequenceGenerator(name = "seq_user", allocationSize = 1)
//    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
//    private Long userId;
//    private String firstName;
//    private String lastName;
//
//    @ElementCollection
//    @CollectionTable(name = "user_numbers", joinColumns = @JoinColumn(name = "user_id"))
//    @Column(name = "number")
//    private List<String> numbers = new ArrayList<>();
//
//    public Users(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//}