package com.company.akh.postgres.mapper.qualifier;

import com.company.akh.postgres.entity.AddressType;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public final class EnumMapper {

    public static List<String> mapToStringList(List<AddressType> addressType) {
        return Optional.ofNullable(addressType)
                .stream()
                .findFirst()
                .orElseThrow()
                .stream()
                .map(AddressType::value)
                .collect(Collectors.toList());
    }

    private EnumMapper() {
    }

}