/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davise.jwt_authentication.service.impl;

import com.davise.jwt_authentication.repository.UserRepository;
import com.davise.jwt_authentication.bean.RandomCity;
import com.davise.jwt_authentication.bean.User;
import com.davise.jwt_authentication.repository.RandomCityRepository;
import com.davise.jwt_authentication.service.GenericService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sethuraman
 */
@Service
public class GenericServiceImpl implements GenericService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RandomCityRepository randomCityRepository;

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<RandomCity> findAllRandomCities() {
        return randomCityRepository.findAll();
    }
}