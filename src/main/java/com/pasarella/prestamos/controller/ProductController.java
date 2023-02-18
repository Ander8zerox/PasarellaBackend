package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    BusinessInterface businessInterface;
    @Autowired
    ControllerMapper mapper;

    @GetMapping("/")
    public String checkHealth() {
        return "Pasarella API works!";
    }

    @PostMapping(path = "/productCreation",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){

        return new ResponseEntity<>( mapper.bProductToProduct(
                businessInterface.createProduct(
                        mapper.productToBProduct(
                                product
                        )
                )
        ), HttpStatus.CREATED);
    }

}

