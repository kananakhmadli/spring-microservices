package com.company.akh.postgres.controller;

import com.company.akh.postgres.service.AddressService;
import com.company.akh.postgres.service.UserService;
import com.company.akh.postgres.dto.AddressDto;
import com.company.akh.postgres.dto.UserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@Tag(name = "User service", description = "This user service used for users")
@Api(value = "User controller for swagger", tags = {"User service"})
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final AddressService addressService;

    @PostConstruct
    public void init() {
        var user = new UserDto();
        user.setName("Taleh");
        user.setSurname("Qasimli");
        user.setAddresses(List.of("home", "work"));
        userService.save(user);
    }

    @PostMapping("user")
    @ApiOperation(value = "Adding new User to DB", notes = "Not need to add ID")
    public UserDto save(@RequestBody @ApiParam(value = "myUserDto") UserDto request) {
        return userService.save(request);
    }

    @GetMapping("user")
    @ApiOperation(value = "Getting all User", notes = "returning UserDtos ")
    public List<UserDto> getAll() {
        return userService.getAllUsers();
    }

    @GetMapping("address")
    public List<AddressDto> getAddress() {
        return addressService.getAllAddress();
    }

}