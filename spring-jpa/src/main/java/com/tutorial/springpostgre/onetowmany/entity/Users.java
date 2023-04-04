//package com.tutorial.springpostgre.onetowmany.entity;
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
//    @OneToMany(cascade = CascadeType.PERSIST)
//    @JoinTable(
//            name = "userAndProduct",
//            joinColumns = @JoinColumn(name = "userId"),
//            inverseJoinColumns = @JoinColumn(name = "productId"))
//    private List<Product> products;
//
//    public Users(String firstName, String lastName, Date dateOfBirth) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//    }
//}