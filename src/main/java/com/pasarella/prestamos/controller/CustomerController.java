package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    BusinessInterface businessInterface;

    @Autowired
    ControllerMapper mapper;

    @PostMapping(path="/customerCreation",consumes = "application/json", produces = "application/json")
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer){
        return new ResponseEntity<>(
                mapper.bCustomerToCustomer(
                        businessInterface.createCustomer(
                                mapper.customerToBCustomer(customer)
                        )
                ), HttpStatus.CREATED
        );
    }

    @GetMapping("/customerObtainAll")
    public ResponseEntity<List<Customer>> obtainCustomers(@RequestParam Long idLocalCreation){
        return new ResponseEntity<>(
                mapper.bCustomerListToCustomerList(
                        businessInterface.getAllCustomers(idLocalCreation)
                ),HttpStatus.OK
        );
    }
}
