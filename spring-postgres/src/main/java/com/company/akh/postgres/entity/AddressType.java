package com.company.akh.postgres.entity;

import java.util.stream.Stream;

public enum AddressType {

    HOME("home"),
    WORK("work"),
    OTHERS("others");

    private final String value;

    AddressType(String value) {
        this.value = value;
    }
    public String value() {
        return this.value;
    }

    public static AddressType of(String value) {
        return Stream.of(AddressType.values())
                .filter(gender -> gender.value.equals(value))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("nod data found"));
    }

}