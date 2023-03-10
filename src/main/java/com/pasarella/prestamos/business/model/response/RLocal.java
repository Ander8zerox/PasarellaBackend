package com.pasarella.prestamos.business.model.response;

import com.pasarella.prestamos.business.repository.model.UserDAO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
public class RLocal {

    private Long idLocal;
    private String localName;
    private String localNumber;
    private Boolean isActive;
    private List<UserDAO> users;
}
