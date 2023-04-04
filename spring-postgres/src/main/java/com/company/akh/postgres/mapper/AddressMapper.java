package com.company.akh.postgres.mapper;

import com.company.akh.postgres.entity.Address;
import com.company.akh.postgres.entity.AddressType;
import com.company.akh.postgres.dto.AddressDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        imports = Boolean.class
)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    AddressDto toAddressDto (Address address);

    List<AddressDto> toAddressDtoList(List<Address> addresses);

    @Mapping(target = "active", expression = "java(Boolean.TRUE)")
    @Mapping(target = "addressName", constant = "somewhere")
    @Mapping(target = "addressType", source = "addressType")
    Address toAddress(AddressType addressType);

    List<Address> toAddressList(List<AddressType> addressTypes);

    default List<AddressType> mapToAddressType(List<String> value) {
        return Optional.ofNullable(value)
                .stream()
                .findFirst()
                .orElseThrow()
                .stream()
                .map(AddressType::of)
                .collect(Collectors.toList());
    }

    default List<Address> mapToAddress(List<String> value) {
        return toAddressList(mapToAddressType(value));
    }

}