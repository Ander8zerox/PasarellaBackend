package com.pasarella.prestamos.controller.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;


@Builder
@Setter
@Getter
@AllArgsConstructor
public class Customer {

    private Long idCustomer;
    @NotBlank(message = "name may not be blank")
    private String name;
    @NotBlank(message = "document may not be blank")
    private Integer document;
    @NotBlank(message = "telephone may not be blank")
    private String telephone;
    @NotBlank(message = "jobLocalName may not be blank")
    private String jobLocalName;
    @NotBlank(message = "gender may not be blank")
    private String gender;
    @NotBlank(message = "idLocalCreation may not be blank")
    private Long idLocalCreation;
}
