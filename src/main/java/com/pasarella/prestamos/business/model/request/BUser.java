package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class BUser {

    private Long idUser;
    private String userName;
    private String password;
    private Boolean isActive;
    private String idLocalCreation;
    private BLocal local;
}
