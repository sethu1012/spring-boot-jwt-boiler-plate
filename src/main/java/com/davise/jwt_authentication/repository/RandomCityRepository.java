/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davise.jwt_authentication.repository;

import com.davise.jwt_authentication.bean.RandomCity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sethuraman
 */
public interface RandomCityRepository extends JpaRepository<RandomCity, Long> {
}