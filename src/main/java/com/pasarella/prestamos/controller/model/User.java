package com.pasarella.prestamos.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class User {

    private Long idUser;
    @NotBlank(message = "userName may not be blank")
    private String userName;
    @NotBlank(message = "password may not be blank")
    private String password;
    @NotNull(message = "isActive may not be blank")
    private Boolean isActive;
    @NotBlank(message = "idLocalCreation may not be blank")
    private String idLocalCreation;
    //@NotNull(message = "local may not be blank")
    private Local local;
}
