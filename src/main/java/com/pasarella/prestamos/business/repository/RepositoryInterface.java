package com.pasarella.prestamos.business.repository;

import com.pasarella.prestamos.business.repository.model.*;
import com.pasarella.prestamos.controller.model.Lending;

import java.util.List;

public interface RepositoryInterface {

    CustomerDAO save(CustomerDAO customerDAO);

    List<CustomerDAO> findAllCustomersByIdLocalCreation(Long idLocalCreation);

    CustomerDAO updateCustomer(Long idCustomer, CustomerDAO customerDAO);

    CustomerDAO findCustomerById(Long idCustomer);

    LendingDAO save(LendingDAO lendingDAO);

    List<LendingDAO> findAllLendingByIdLocalCreation(Long idLocalCreation);

    List<LendingDAO> findAllLendingByIdLocalCreationAndDate(String date, Long idLocalCreation);

    LendingDAO updateLending(Long idLending, LendingDAO lending);

    LendingDAO findLendingById(Long idLending);

    LocalDAO save(LocalDAO localDAO);

    ProductDAO save(ProductDAO productDAO);

    List<ProductDAO> findAllProductsByIdLocalCreation(Long idLocalCreation);

    ProductDAO updateProduct(Long idProduct, ProductDAO productDAO);

    ProductDAO findProductById(Long idProduct);

    UserDAO save(UserDAO userDAO);

    UserDAO findByUserName(String userName);
}
