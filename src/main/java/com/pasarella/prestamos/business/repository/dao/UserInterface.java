package com.pasarella.prestamos.business.repository.dao;

import com.pasarella.prestamos.business.repository.model.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInterface extends JpaRepository<UserDAO,Long> {

    UserDAO save(UserDAO userDAO);

    UserDAO findByUserName(String userName);
}
