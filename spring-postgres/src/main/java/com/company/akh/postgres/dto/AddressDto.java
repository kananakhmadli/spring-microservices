package com.company.akh.postgres.dto;

import com.company.akh.postgres.entity.AddressType;
import lombok.Data;

@Data
public class AddressDto {

    private Long addressId;
    private String addressName;
    private AddressType addressType;
    private Boolean active;

}