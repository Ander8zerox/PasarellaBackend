package com.pasarella.prestamos.controller.model;

import com.pasarella.prestamos.business.repository.model.ProductDAO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class Lending {

    private Long idLending;
    @NotBlank(message = "dateLending may not be blank")
    private String dateLending;
    @NotBlank(message = "idCustomer may not be blank")
    private Long idCustomer;
    @NotBlank(message = "status may not be blank")
    private String status;
    @NotBlank(message = "totalAmount may not be blank")
    private String totalAmount;
    @NotBlank(message = "products may not be blank")
    private ArrayList<Product> products;
    @NotBlank(message = "observation may not be blank")
    private String observation;
    @NotBlank(message = "idLocalCreation may not be blank")
    private Long idLocalCreation;
}