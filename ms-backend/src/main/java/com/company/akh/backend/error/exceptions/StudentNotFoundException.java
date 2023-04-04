package com.company.akh.backend.error.exceptions;

import com.company.akh.backend.error.ErrorCode;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class StudentNotFoundException extends ServiceException {

    public StudentNotFoundException(String message) {
        super(ErrorCode.STUDENT_NOT_FOUND.code(), message);
    }

}