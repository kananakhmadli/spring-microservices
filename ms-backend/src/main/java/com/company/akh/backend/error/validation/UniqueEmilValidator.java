package com.company.akh.backend.error.validation;

import com.company.akh.backend.error.validation.constraints.UniqueEmail;
import com.company.akh.backend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmilValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        return studentRepository.checkByEmail(email);
    }

}