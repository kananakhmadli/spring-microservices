package com.company.akh.backend.error.validation.constraints;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ErrMessage {

    public static final String FIRSTNAME_SIZE = "error.firstNameSize.message";
    public static final String FIRSTNAME_NOT_NULL = "error.firstNameNotNull.message";
    public static final String LASTNAME_SIZE = "error.lastNameSize.message";
    public static final String LASTNAME_NOT_NULL = "error.lastNameNotNull.message";
    public static final String EMAIL_SIZE = "error.emailSize.message";
    public static final String EMAIL_NOT_NULL = "error.emailNotNull.message";
    public static final String EMAIL_UNIQUE = "error.emailUniqueEmail.message";
    public static final String PASSWORD_NOT_NULL = "error.passwordNotNull.message";
    public static final String ID_NOT_NULL = "error.idNotNull.message";

}