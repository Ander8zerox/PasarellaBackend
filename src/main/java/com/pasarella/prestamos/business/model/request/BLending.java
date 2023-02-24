package com.pasarella.prestamos.business.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class BLending {

    private Long idLending;
    private String dateLending;
    private String customerName;
    private Long idCustomer;
    private String jobLocal;
    private String status;
    private BigDecimal totalAmount;
    private ArrayList<BProduct> products;
    private String observation;
    private Long idLocalCreation;
}
