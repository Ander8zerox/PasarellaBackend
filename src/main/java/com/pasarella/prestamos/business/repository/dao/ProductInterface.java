package com.pasarella.prestamos.business.repository.dao;

import com.pasarella.prestamos.business.repository.model.ProductDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInterface extends JpaRepository<ProductDAO,Long> {

    ProductDAO save(ProductDAO productDAO);

    List<ProductDAO> findAllByIdLocalCreation(Long idLocalCreation);

    ProductDAO findByIdProduct(Long idProduct);
}
