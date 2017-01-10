package com.secur.service;

/**
 * Created by Дмитро on 1/10/2017.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
