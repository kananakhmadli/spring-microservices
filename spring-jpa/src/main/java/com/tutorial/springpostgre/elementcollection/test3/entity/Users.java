//package com.tutorial.springpostgre.elementcollection.test3.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapKeyColumn;
//import javax.persistence.MapKeyEnumerated;
//import javax.persistence.SequenceGenerator;
//import java.util.HashMap;
//import java.util.Map;
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
//    @CollectionTable(name = "user2_numbers", joinColumns = @JoinColumn(name = "user_id"))
//    @MapKeyColumn(name = "phone_type")
//    @Column(name = "number")
//    @MapKeyEnumerated(EnumType.STRING)
//    private Map<PhoneType, String> numbers = new HashMap<>();
//
//    public Users(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//}