package com.company.akh.apiserver.error;

import az.kapitalbank.atlas.lib.common.error.ErrorCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ErrorCodes implements ErrorCode {

    CUSTOMER_NOT_FOUND("Customer not found");

    private final String message;

    @Override
    public String code() {
        return this.name();
    }

    @Override
    public String message() {
        return this.message;
    }


}