package com.secur.dao;

import com.secur.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Дмитро on 1/10/2017.
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
