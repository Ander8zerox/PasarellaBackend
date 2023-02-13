package com.pasarella.prestamos.business.model.request;

import com.pasarella.prestamos.business.repository.model.LocalDAO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class BUser {

    private Long idUser;
    private String userName;
    private String password;
    private Boolean isActive;
    private String idLocalCreation;
    private LocalDAO local;
}
