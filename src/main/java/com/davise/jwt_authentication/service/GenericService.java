/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davise.jwt_authentication.service;

import com.davise.jwt_authentication.bean.RandomCity;
import com.davise.jwt_authentication.bean.User;
import java.util.List;

/**
 *
 * @author sethuraman
 */
public interface GenericService {
    User findByUsername(String username);

    List<User> findAllUsers();

    List<RandomCity> findAllRandomCities();
}