//package com.tutorial.springpostgre.onetowmany.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
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
//    public Product(String name, double unitPrice, int available, Date date) {
//        this.name = name;
//        this.unitPrice = unitPrice;
//        this.available = available;
//        this.date = date;
//    }
//}