package com.company.akh.postgres.mapper;

import com.company.akh.postgres.dto.UserDto;
import com.company.akh.postgres.entity.Address;
import com.company.akh.postgres.entity.AddressType;
import com.company.akh.postgres.entity.Users;
import com.company.akh.postgres.mapper.qualifier.EnumMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {
                EnumMapper.class
        })
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "usersId", source = "id")
    Users toUser(UserDto userDto);

    @Mapping(target = "id", source = "usersId")
    UserDto toUserDto(Users users);

    List<UserDto> toUserDtoList(List<Users> users);

    default List<AddressType> mapToAddressType(List<Address> addresses) {
        return Optional.ofNullable(addresses)
                .stream()
                .findFirst()
                .orElseThrow()
                .stream()
                .map(Address::getAddressType)
                .collect(Collectors.toList());
    }

}