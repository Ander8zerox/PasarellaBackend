package com.pasarella.prestamos.business.repository.dao;

import com.pasarella.prestamos.business.repository.model.LendingDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LendingInterface extends JpaRepository<LendingDAO,Long> {

    LendingDAO save(LendingDAO lendingDAO);

    List<LendingDAO> findAllByIdLocalCreation(Long idLocalCreation);

    List<LendingDAO> findAllByIdLocalCreationAndDateLending(Long idLocalCreation, String dateLending);

    List<LendingDAO> findAllByIdLocalCreationAndStatus(Long idLocalCreation, String status);

    LendingDAO findByIdLending(Long idLending);


}
