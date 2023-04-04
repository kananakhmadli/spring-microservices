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
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Data
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//public class Student {
//
//    @Id
//    @SequenceGenerator(name = "seq_student", allocationSize = 1)
//    @GeneratedValue(generator = "seq_student", strategy = GenerationType.SEQUENCE)
//    private Long studentId;
//    private String firstName;
//    private String lastName;
//
//    @Temporal(TemporalType.DATE)
//    private Date birthOfDate;
//
//    @ManyToMany
//    @JoinTable(name = "student_university",
//            joinColumns = @JoinColumn(name = "studentId"),
//            inverseJoinColumns = @JoinColumn(name = "universityId"))
//    private List<University> universitys = new ArrayList<>();
//
//    public Student(String firstName, String lastName, Date birthOfDate) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.birthOfDate = birthOfDate;
//    }
//
//}