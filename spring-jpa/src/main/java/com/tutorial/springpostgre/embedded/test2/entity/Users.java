//package com.tutorial.springpostgre.embedded.test2.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Embedded;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.util.Date;
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
//    private String username;
//    private String firstName;
//
//    @Temporal(TemporalType.DATE)
//    private Date birthOfDate;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "email", column = @Column(name = "gmail"))
//    })
//    private Contact contact;
//
//    public Users(String username, String firstName, Date birthOfDate, Contact contact) {
//        this.username = username;
//        this.firstName = firstName;
//        this.birthOfDate = birthOfDate;
//        this.contact = contact;
//    }
//
//}