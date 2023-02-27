package com.pasarella.prestamos.business;

import com.pasarella.prestamos.business.model.request.BCustomer;
import com.pasarella.prestamos.business.model.request.BLending;
import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.business.model.request.BUser;
import com.pasarella.prestamos.business.repository.model.LendingDAO;

import java.util.List;

public interface BusinessInterface {

    BProduct createProduct(BProduct bProduct);

    List<BProduct> getAllProducts(Long idLocalCreation);

    BProduct updateProduct(Long idProduct, BProduct bProduct);

    BProduct getProductById(Long idProduct);

    BCustomer createCustomer(BCustomer bCustomer);

    BCustomer getCustomerById(Long idCustomer);

    List<BCustomer> getAllCustomers(Long idLocalCreation);

    BCustomer updateCustomer(Long idCustomer, BCustomer customer);

    BLending createLending(BLending lending);

    List<BLending> getLendingsByDateAndIdLocalCreation(String date,Long idLocalCreation);

    List<BLending> getLendingsByIdLocalCreationAndStatus(Long idLocalCreation, String status);

    BLending updateLending(Long idLending, BLending bLending);

    BLending getLendingById(Long idLending);

    BUser createUser(BUser bUser);

    BUser getUserByUserName(String userName);
}
