package com.pasarella.prestamos.business.repository;

import com.pasarella.prestamos.business.repository.model.*;

import java.util.List;

public interface RepositoryInterface {

    CustomerDAO save(CustomerDAO customerDAO);

    List<CustomerDAO> findAllCustomersByIdLocalCreation(Long idLocalCreation);

    LendingDAO save(LendingDAO lendingDAO);

    List<LendingDAO> findAllLendingByIdLocalCreation(Long idLocalCreation);

    LocalDAO save(LocalDAO localDAO);

    ProductDAO save(ProductDAO productDAO);

    List<ProductDAO> findAllProductsByIdLocalCreation(Long idLocalCreation);

    ProductDAO updateProduct(Long idProduct, ProductDAO productDAO);

    UserDAO save(UserDAO userDAO);

    UserDAO findByUserName(String userName);
}
