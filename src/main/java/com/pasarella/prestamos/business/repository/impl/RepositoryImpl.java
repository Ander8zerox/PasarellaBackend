package com.pasarella.prestamos.business.repository.impl;

import com.pasarella.prestamos.business.repository.RepositoryInterface;
import com.pasarella.prestamos.business.repository.dao.*;
import com.pasarella.prestamos.business.repository.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositoryImpl implements RepositoryInterface {

    @Autowired
    CustomerInterface customerInterface;
    @Autowired
    LendingInterface lendingInterface;
    @Autowired
    LocalInterface localInterface;
    @Autowired
    ProductInterface productInterface;
    @Autowired
    UserInterface userInterface;

    @Override
    public CustomerDAO save(CustomerDAO customerDAO) {
        return customerInterface.save(customerDAO);
    }

    @Override
    public List<CustomerDAO> findAllCustomersByIdLocalCreation(Long idLocalCreation) {
        return customerInterface.findAllByIdLocalCreation(idLocalCreation);
    }

    @Override
    public LendingDAO save(LendingDAO lendingDAO) {
        return lendingInterface.save(lendingDAO);
    }

    @Override
    public List<LendingDAO> findAllLendingByIdLocalCreation(Long idLocalCreation) {
        return lendingInterface.findAllByIdLocalCreation(idLocalCreation);
    }

    @Override
    public LocalDAO save(LocalDAO localDAO) {
        return localInterface.save(localDAO);
    }

    @Override
    public ProductDAO save(ProductDAO productDAO) {
        return productInterface.save(productDAO);
    }

    @Override
    public List<ProductDAO> findAllProductsByIdLocalCreation(Long idLocalCreation) {
        return productInterface.findAllByIdLocalCreation(idLocalCreation);
    }

    @Override
    public UserDAO save(UserDAO userDAO) {
        return userInterface.save(userDAO);
    }

    @Override
    public UserDAO findByUserName(String userName) {
        return userInterface.findByUserName(userName);
    }
}
