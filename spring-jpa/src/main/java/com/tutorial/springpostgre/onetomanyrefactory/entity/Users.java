//package com.tutorial.springpostgre.onetomanyrefactory.entity;
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
//import javax.persistence.JoinTable;
//import javax.persistence.OneToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//public class Users {
//
//    @Id
//    @SequenceGenerator(name = "seq_user", allocationSize = 1)
//    @GeneratedValue(generator = "seq_user", strategy = GenerationType.SEQUENCE)
//    private Long usersId;
//    private String firstName;
//    private String lastName;
//
//    @Temporal(TemporalType.DATE)
//    private Date dateOfBirth;
//
//    @OneToMany(mappedBy = "user")
//    private List<Product> products = new ArrayList<>();
//
//    public Users(String firstName, String lastName, Date dateOfBirth) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//    }
//}