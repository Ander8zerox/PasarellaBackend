package com.pasarella.prestamos.business.repository.dao;

import com.pasarella.prestamos.business.repository.model.CustomerDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerInterface extends JpaRepository<CustomerDAO,Long> {

    CustomerDAO save(CustomerDAO customerDAO);

    List<CustomerDAO> findAllByIdLocalCreation(Long idLocalCreation);
}
