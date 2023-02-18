package com.pasarella.prestamos.business;

import com.pasarella.prestamos.business.model.request.BProduct;

import java.util.List;

public interface BusinessInterface {

    BProduct createProduct(BProduct bProduct);

    List<BProduct> getAllProducts(Long idLocalCreation);

    BProduct updateProduct(Long idProduct, BProduct bProduct);
}
