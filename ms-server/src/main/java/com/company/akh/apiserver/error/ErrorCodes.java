package com.company.akh.apiserver.error;

import az.kapitalbank.atlas.lib.common.error.ErrorCode;

public enum ErrorCodes implements ErrorCode {

    CUSTOMER_NOT_FOUND;

    @Override
    public String code() {
        return this.name();
    }

}