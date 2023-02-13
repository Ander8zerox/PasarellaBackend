package com.pasarella.prestamos.business.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
public class RCustomer {

    private Long idCustomer;
    private String name;
    private Integer document;
    private String telephone;
    private String jobLocalName;
    private String gender;
    private Long idLocalCreation;
}
