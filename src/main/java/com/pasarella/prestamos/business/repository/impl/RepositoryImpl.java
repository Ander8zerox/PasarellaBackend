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
    public CustomerDAO updateCustomer(Long idCustomer, CustomerDAO customerDAO) {
        CustomerDAO internalCustomerDao = customerInterface.findByIdCustomer(idCustomer);
        internalCustomerDao.setName(customerDAO.getName());
        internalCustomerDao.setTelephone(customerDAO.getTelephone());
        internalCustomerDao.setGender(customerDAO.getGender());
        internalCustomerDao.setJobLocalName(customerDAO.getJobLocalName());
        return customerInterface.save(internalCustomerDao);
    }

    @Override
    public CustomerDAO findCustomerById(Long idCustomer) {
        return customerInterface.findByIdCustomer(idCustomer);
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
    public List<LendingDAO> findAllLendingByIdLocalCreationAndDate(String date, Long idLocalCreation) {
        return lendingInterface.findAllByIdLocalCreationAndDateLending(idLocalCreation,date);
    }

    @Override
    public LendingDAO updateLending(Long idLending, LendingDAO lending) {
        LendingDAO internalLending = lendingInterface.findByIdLending(idLending);
        internalLending.setProducts(lending.getProducts());
        internalLending.setObservation(lending.getObservation());
        internalLending.setStatus(lending.getStatus());
        internalLending.setTotalAmount(lending.getTotalAmount());
        return lendingInterface.save(internalLending);
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
    public ProductDAO updateProduct(Long idProduct, ProductDAO productDAO) {

        ProductDAO internalProductDao = productInterface.findByIdProduct(idProduct);
        internalProductDao.setCode(productDAO.getCode());
        internalProductDao.setName(productDAO.getName());
        internalProductDao.setPrice(productDAO.getPrice());
        return productInterface.save(internalProductDao);

    }

    @Override
    public ProductDAO findProductById(Long idProduct) {
        return productInterface.findByIdProduct(idProduct);
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
