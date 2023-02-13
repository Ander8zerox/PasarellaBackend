package com.pasarella.prestamos.business.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
public class BCustomer {

    private Long idCustomer;
    private String name;
    private Integer document;
    private String telephone;
    private String jobLocalName;
    private String gender;
    private Long idLocalCreation;
}