//package com.tutorial.springpostgre.onetoone.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Customer {
//
//    @Id
//    @SequenceGenerator(name = "seq_customer", allocationSize = 1)
//    @GeneratedValue(generator = "seq_customer", strategy = GenerationType.SEQUENCE)
//    private Long customerId;
//    private String firstName;
//    private String lastName;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
//    private Address address;
//
//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//}