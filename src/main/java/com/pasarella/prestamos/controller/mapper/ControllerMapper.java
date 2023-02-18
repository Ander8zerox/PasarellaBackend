package com.pasarella.prestamos.controller.mapper;

import com.pasarella.prestamos.business.model.request.BProduct;
import com.pasarella.prestamos.controller.model.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ControllerMapper {

    BProduct productToBProduct(Product product);

    Product bProductToProduct(BProduct bProduct);

    List<Product> bProductListToProductList(List<BProduct> bProductList);
}
