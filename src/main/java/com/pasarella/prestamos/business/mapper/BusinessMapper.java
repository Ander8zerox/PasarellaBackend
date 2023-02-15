package com.pasarella.prestamos.business.mapper;

import com.pasarella.prestamos.business.model.request.*;
import com.pasarella.prestamos.business.repository.model.*;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusinessMapper {

    CustomerDAO BCustomerToCustomerDAO(BCustomer bCustomer);

    LendingDAO BLendingToLendingDAO(BLending bLending);

    LocalDAO BLocalToLocalDAO(BLocal bLocal);

    ProductDAO BProductToProductDAO(BProduct bProduct);

    UserDAO BUserToUserDAO(BUser bUser);

    BCustomer CustomerDAOToBCustomer(CustomerDAO customerDAO);

    BLending LendingDAOToBLending(LendingDAO lendingDAO);

    BLocal LocalDAOToBLocal(LocalDAO localDAO);

    BProduct ProductDAOToBProduct(ProductDAO productDAO);

    List<BProduct> ProductDAOListToBProductList(List<ProductDAO> productDAOList);

    BUser UserDAOToBUser(UserDAO userDAO);
}
