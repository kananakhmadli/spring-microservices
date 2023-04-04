package com.company.akh.backend.error;

public enum ErrorCode {

    STUDENT_NOT_FOUND,
    UNKNOWN_ERROR;

    public String code() {
        return this.name();
    }

}