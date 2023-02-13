package com.pasarella.prestamos.business.repository.dao;

import com.pasarella.prestamos.business.repository.model.LocalDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalInterface extends JpaRepository<LocalDAO,Long> {

    LocalDAO save(LocalDAO localDAO);

}
