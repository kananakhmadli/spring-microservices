package com.company.akh.postgres.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Data()
@Entity
@Table(name = "address")
public class Address {

    @Id
    @SequenceGenerator(name = "seq_address", allocationSize = 1)
    @GeneratedValue(generator = "seq_address", strategy = GenerationType.SEQUENCE)
    private Long addressId;
    private String addressName;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "usersId")
    private Users users;

}