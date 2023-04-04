//package com.tutorial.springpostgre.onetomanyrefactory.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.util.Date;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Product {
//
//    @Id
//    @SequenceGenerator(name = "seq_product", allocationSize = 1)
//    @GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
//    private Long productId;
//    private String name;
//    private double unitPrice;
//    private int available;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date date;
//
//    @ManyToOne
//    @JoinColumn(name = "userId")
//    private Users user;
//
//    public Product(String name, double unitPrice, int available, Date date) {
//        this.name = name;
//        this.unitPrice = unitPrice;
//        this.available = available;
//        this.date = date;
//    }
//
//}