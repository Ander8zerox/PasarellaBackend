package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("/productObtainAll")
    public ResponseEntity<List<Product>> obtainProducts(@RequestParam Long idLocalCreation){
        return new ResponseEntity<>(
                mapper.bProductListToProductList(
                        businessInterface.getAllProducts(idLocalCreation)
                ),HttpStatus.OK
        );
    }

    @PutMapping("/productUpdating/{idProduct}")
    public ResponseEntity<Product> updateProduct(@PathVariable("idProduct") Long idProduct, @RequestBody Product product){
        return new ResponseEntity<>(
                mapper.bProductToProduct(
                    businessInterface.updateProduct(idProduct,
                            mapper.productToBProduct(product))
                ),HttpStatus.OK
        );
    }

}

