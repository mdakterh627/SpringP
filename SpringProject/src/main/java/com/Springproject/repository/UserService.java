/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Springproject.repository;

import com.Springproject.model.Login;
import com.Springproject.model.User;

import org.springframework.stereotype.Repository;

/**
 *
 * @author user
 */
@Repository(value = "userRepo")
public interface UserService {

    public void register(User user);

    public User validateUser(Login login);
    
}
