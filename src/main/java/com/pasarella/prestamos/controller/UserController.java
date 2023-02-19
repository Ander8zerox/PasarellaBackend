package com.pasarella.prestamos.controller;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.controller.mapper.ControllerMapper;
import com.pasarella.prestamos.controller.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class UserController {

    @Autowired
    BusinessInterface businessInterface;

    @Autowired
    ControllerMapper mapper;

    @PostMapping(path="/userCreation", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
        return new ResponseEntity<>(
                mapper.bUserToUser(
                        businessInterface.createUser(
                                mapper.UserToBUser(user)
                        )
                ), HttpStatus.CREATED
        );
    }

    @GetMapping("/userObtain")
    public ResponseEntity<User> obtainUser(@RequestParam String userName){
        return new ResponseEntity<>(
                mapper.bUserToUser(
                        businessInterface.getUserByUserName(userName)
                ),HttpStatus.OK
        );
    }
}
