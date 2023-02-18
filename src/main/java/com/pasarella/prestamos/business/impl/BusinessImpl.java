package com.pasarella.prestamos.business.impl;

import com.pasarella.prestamos.business.BusinessInterface;
import com.pasarella.prestamos.business.mapper.BusinessMapper;
import com.pasarella.prestamos.business.model.request.BCustomer;
import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.business.repository.RepositoryInterface;
import com.pasarella.prestamos.business.repository.model.CustomerDAO;
import com.pasarella.prestamos.business.repository.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessImpl implements BusinessInterface {

    @Autowired
    BusinessMapper mapper;

    @Autowired
    RepositoryInterface repositoryInterface;

    @Override
    public BProduct createProduct(BProduct bProduct) {
        ProductDAO productDAO = mapper.BProductToProductDAO(bProduct);
        return mapper.ProductDAOToBProduct(repositoryInterface.save(productDAO));
    }

    @Override
    public List<BProduct> getAllProducts(Long idLocalCreation) {
        return mapper.ProductDAOListToBProductList(repositoryInterface.findAllProductsByIdLocalCreation(idLocalCreation));
    }

    @Override
    public BProduct updateProduct(Long idProduct, BProduct bProduct) {

        return mapper.ProductDAOToBProduct(
                repositoryInterface.updateProduct(idProduct,
                        mapper.BProductToProductDAO(bProduct))
        );
    }

    @Override
    public BCustomer createCustomer(BCustomer bCustomer) {
        CustomerDAO customerDAO = mapper.BCustomerToCustomerDAO(bCustomer);
        return mapper.CustomerDAOToBCustomer(repositoryInterface.save(customerDAO));
    }

    @Override
    public List<BCustomer> getAllCustomers(Long idLocalCreation) {
        return mapper.CustomerDAOListToBCustomerList(repositoryInterface.findAllCustomersByIdLocalCreation(idLocalCreation));
    }
}
