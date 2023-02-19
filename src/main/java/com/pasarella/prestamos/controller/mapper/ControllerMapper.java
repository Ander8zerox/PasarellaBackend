package com.pasarella.prestamos.controller.mapper;

import com.pasarella.prestamos.business.model.request.BCustomer;
import com.pasarella.prestamos.business.model.request.BLending;
import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.business.model.request.BUser;
import com.pasarella.prestamos.controller.model.Customer;
import com.pasarella.prestamos.controller.model.Lending;
import com.pasarella.prestamos.controller.model.Product;
import com.pasarella.prestamos.controller.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ControllerMapper {

    BProduct productToBProduct(Product product);

    Product bProductToProduct(BProduct bProduct);

    List<Product> bProductListToProductList(List<BProduct> bProductList);

    BCustomer customerToBCustomer(Customer customer);

    Customer bCustomerToCustomer(BCustomer bCustomer);

    List<Customer> bCustomerListToCustomerList(List<BCustomer> bCustomerList);

    BLending lendingToBLending(Lending lending);

    Lending bLendingToLending(BLending lending);

    List<Lending> bLendingListToLendingList(List<BLending> bLendingList);

    User bUserToUser(BUser bUser);

    BUser UserToBUser(User user);
}
