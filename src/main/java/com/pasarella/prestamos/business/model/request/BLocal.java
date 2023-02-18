package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class BLocal {

    private Long idLocal;
    private String localName;
    private String localNumber;
    private Boolean isActive;
    private List<BUser> users;
}
