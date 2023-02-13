package com.pasarella.prestamos.business.model.response;

import com.pasarella.prestamos.business.repository.model.ProductDAO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Builder
@Setter
@Getter
public class RLending {

    private Long idLending;
    private String dateLending;
    private Long idCustomer;
    private String status;
    private String totalAmount;
    private ArrayList<ProductDAO> products;
    private String observation;
    private Long idLocalCreation;
}
