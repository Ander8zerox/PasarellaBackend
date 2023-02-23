package com.pasarella.prestamos.controller.model;

import com.pasarella.prestamos.business.repository.model.ProductDAO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;

@Builder
@Setter
@Getter
@AllArgsConstructor
public class Lending {

    private Long idLending;
    @NotBlank(message = "dateLending may not be blank")
    private String dateLending;
    @NotBlank(message = "customerName may not be blank")
    private String customerName;
    @NotNull(message = "idCustomer may not be blank")
    private Long idCustomer;
    @NotBlank(message = "status may not be blank")
    private String status;
    @NotBlank(message = "totalAmount may not be blank")
    private String totalAmount;
    @NotNull(message = "products may not be blank")
    private ArrayList<Product> products;
    @NotBlank(message = "observation may not be blank")
    private String observation;
    @NotNull(message = "idLocalCreation may not be blank")
    private Long idLocalCreation;
}
