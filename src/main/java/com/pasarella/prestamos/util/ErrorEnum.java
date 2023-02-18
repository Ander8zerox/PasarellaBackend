package com.pasarella.prestamos.util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ErrorEnum {

    CODE_ALREADY_EXISTS("the code is already registered"),
    USERNAME_ALREADY_EXISTS("the username is already registered");

    @Getter
    private String value;

}

