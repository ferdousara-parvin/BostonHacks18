/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import java.util.Arrays;
import java.util.List;

import com.bostonHacks.DontTrashMyHouse.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.bostonHacks.DontTrashMyHouse.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Etienne
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String id) {
        List<User> toReturn = userRepository.findAll();
        System.out.println(Arrays.toString(toReturn.toArray()));
        return toReturn.get(0);
    }
    
    public User findByUsername(String username) //throws Exception???
    {
        return userRepository.findByUsername(username);
    }
    
    @Override
    public User save(User user){
        return userRepository.save(user);
    }
    
    @Override
    public User edit(User user){
        return userRepository.save(user);
    }
    
    public User login(String username, String password){
        return null;
    }
    
    
    
    
}
