/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.davise.jwt_authentication.controller;

import com.davise.jwt_authentication.util.UriConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sethuraman
 */
@RequestMapping(path = UriConstants.API + UriConstants.TEST)
@RestController
public class TestController {
    
    @RequestMapping(path = UriConstants.PING)
    public ResponseEntity test() {
        return new ResponseEntity("PONG", HttpStatus.OK);
    }
    
}
