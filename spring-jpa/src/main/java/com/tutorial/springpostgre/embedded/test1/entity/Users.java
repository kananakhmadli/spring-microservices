package com.tutorial.springpostgre.embedded.test1.entity;//package com.tutorial.springpostgre.embedded.test1.entity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
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
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.List;
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
//    private String username;
//    private String firstName;
//
//    @Temporal(TemporalType.DATE)
//    private Date birthOfDate;
//    @ElementCollection
//    @CollectionTable(name = "user_addres", joinColumns = @JoinColumn(name = "userId"))
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "kuce")),
//            @AttributeOverride(name = "district", column = @Column(name = "kent"))
//
//    })
//    private List<Address> addresses = new ArrayList<>();
//
//    public Users(String username, String firstName, Date birthOfDate) {
//        this.username = username;
//        this.firstName = firstName;
//        this.birthOfDate = birthOfDate;
//    }
//
//}