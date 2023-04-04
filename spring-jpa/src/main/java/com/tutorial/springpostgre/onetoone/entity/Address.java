//package com.tutorial.springpostgre.onetoone.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Address {
//
//    @Id
//    @SequenceGenerator(name = "seq_address", allocationSize = 1)
//    @GeneratedValue(generator = "seq_address", strategy = GenerationType.SEQUENCE)
//    private Long addressId;
//    private String street;
//    private String city;
//    private Integer postalCode;
//
//    @OneToOne(mappedBy = "address")
//    private Customer customer;
//
//    public Address(String street, String city, Integer postalCode) {
//        this.street = street;
//        this.city = city;
//        this.postalCode = postalCode;
//    }
//
//}