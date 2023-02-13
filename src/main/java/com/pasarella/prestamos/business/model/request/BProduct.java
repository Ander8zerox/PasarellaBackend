package com.pasarella.prestamos.business.model.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class BProduct {

    private Long idProduct;
    private Long code;
    private Long name;
    private Long price;
    private Long idLocalCreation;
}
