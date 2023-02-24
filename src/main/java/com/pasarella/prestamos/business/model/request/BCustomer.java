package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;


@Builder
@Setter
@Getter
@AllArgsConstructor
public class BCustomer {

    private Long idCustomer;
    private String name;
    private BigInteger document;
    private String telephone;
    private String jobLocalName;
    private String gender;
    private Long idLocalCreation;
}
