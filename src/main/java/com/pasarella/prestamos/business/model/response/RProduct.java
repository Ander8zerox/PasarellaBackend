package com.pasarella.prestamos.business.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class RProduct {

    private Long idProduct;
    private Long code;
    private Long name;
    private Long price;
    private Long idLocalCreation;
}
