package com.pasarella.prestamos.business;

import com.pasarella.prestamos.business.model.request.BCustomer;
import com.pasarella.prestamos.business.model.request.BLending;
import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.controller.model.Customer;
import com.pasarella.prestamos.controller.model.Lending;

import java.util.List;

public interface BusinessInterface {

    BProduct createProduct(BProduct bProduct);

    List<BProduct> getAllProducts(Long idLocalCreation);

    BProduct updateProduct(Long idProduct, BProduct bProduct);

    BCustomer createCustomer(BCustomer bCustomer);

    List<BCustomer> getAllCustomers(Long idLocalCreation);

    BCustomer updateCustomer(Long idCustomer, BCustomer customer);

    BLending createLending(BLending lending);
}
