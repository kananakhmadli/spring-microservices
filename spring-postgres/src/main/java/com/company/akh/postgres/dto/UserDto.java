package com.company.akh.postgres.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(value = "My UserDto model", description = "This model used for controller")
public class UserDto {

    @ApiModelProperty(value = "Unique id for userDto")
    private Long id;

    @ApiModelProperty(value = "Name for userDto")
    private String name;

    @ApiModelProperty(value = "Surname for userDto")
    private String surname;
    private List<String> addresses;

}