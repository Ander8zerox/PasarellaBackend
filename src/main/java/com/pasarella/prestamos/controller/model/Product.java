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
public class Product {

    private Long idProduct;
    @NotBlank(message = "code may not be blank")
    private String code;
    @NotBlank(message = "name may not be blank")
    private String name;
    @NotBlank(message = "price may not be blank")
    private String price;
    @NotNull(message = "idLocalCreation may not be blank")
    private Long idLocalCreation;
}
