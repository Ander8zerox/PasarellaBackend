package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class BProduct {

    private Long idProduct;
    private String code;
    private String name;
    private String price;
    private Long idLocalCreation;
}
