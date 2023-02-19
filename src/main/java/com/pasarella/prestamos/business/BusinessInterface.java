package com.pasarella.prestamos.business;

import com.pasarella.prestamos.business.model.request.BCustomer;
import com.pasarella.prestamos.business.model.request.BLending;
import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.business.model.request.BUser;

import java.util.List;

public interface BusinessInterface {

    BProduct createProduct(BProduct bProduct);

    List<BProduct> getAllProducts(Long idLocalCreation);

    BProduct updateProduct(Long idProduct, BProduct bProduct);

    BCustomer createCustomer(BCustomer bCustomer);

    List<BCustomer> getAllCustomers(Long idLocalCreation);

    BCustomer updateCustomer(Long idCustomer, BCustomer customer);

    BLending createLending(BLending lending);

    List<BLending> getLendingsByDateAndIdLocalCreation(String date,Long idLocalCreation);

    BLending updateLending(Long idLending, BLending bLending);

    BUser createUser(BUser bUser);

    BUser getUserByUserName(String userName);
}
