/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davise.jwt_authentication.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sethuraman
 */
@Configuration
public class AppConfig {
    
    @Bean
    public JWTConfig jwtConfig() {
        return new JWTConfig();
    }
    
}
