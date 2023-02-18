package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class BLending {

    private Long idLending;
    private String dateLending;
    private Long idCustomer;
    private String status;
    private String totalAmount;
    private ArrayList<BProduct> products;
    private String observation;
    private Long idLocalCreation;
}
