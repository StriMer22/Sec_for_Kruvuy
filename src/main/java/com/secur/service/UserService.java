package com.secur.service;

import com.secur.model.User;

/**
 * Created by Дмитро on 1/10/2017.
 */
public interface UserService {

    void save(User user);
    User findByUserName(String username);
}
