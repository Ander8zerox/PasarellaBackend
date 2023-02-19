package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.Lending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LendingController {

    @Autowired
    BusinessInterface businessInterface;

    @Autowired
    ControllerMapper mapper;

    @PostMapping(path = "/lendingCreation", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Lending> createLending(@Valid @RequestBody Lending lending){
        return new ResponseEntity<>(
                mapper.bLendingToLending(
                        businessInterface.createLending(
                                mapper.lendingToBLending(lending)
                        )
                ), HttpStatus.CREATED
        );
    }
}
