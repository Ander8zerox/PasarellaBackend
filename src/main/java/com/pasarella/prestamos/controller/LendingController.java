package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.Lending;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @GetMapping("/lendingsObtainByDate")
    public ResponseEntity<List<Lending>> obtainLendings(@RequestParam String date, @RequestParam Long idLocalCreation){
        return new ResponseEntity<>(
                mapper.bLendingListToLendingList(
                        businessInterface.getLendingsByDateAndIdLocalCreation(date,idLocalCreation)
                ),HttpStatus.OK
        );
    }

    @GetMapping("/lendingById")
    public ResponseEntity<Lending> obtainLendingById(@RequestParam Long idLending){
        return new ResponseEntity<>(
                mapper.bLendingToLending(
                        businessInterface.getLendingById(idLending)
                ),HttpStatus.OK
        );
    }

    @PutMapping("/lendingUpdating/{idLending}")
    public ResponseEntity<Lending> updateLending(@PathVariable("idLending")Long idLending, @RequestBody Lending lending){
        return new ResponseEntity<>(
                mapper.bLendingToLending(
                        businessInterface.updateLending(idLending,
                                mapper.lendingToBLending(lending))
                ),HttpStatus.OK
        );
    }
}
