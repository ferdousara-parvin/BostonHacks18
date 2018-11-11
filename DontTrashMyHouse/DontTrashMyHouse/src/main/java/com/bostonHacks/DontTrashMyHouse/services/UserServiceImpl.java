/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import java.util.Arrays;
import java.util.List;

import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbUser;
import com.bostonHacks.DontTrashMyHouse.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.bostonHacks.DontTrashMyHouse.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Etienne
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getUser(String id) {
        MdbUser toReturn = userRepository.findById(id).orElse(null);
        User u = (toReturn != null) ? toReturn.toUser() : null;
        return u;
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email).toUser();
    }

    @Override
    public User save(User user) {
        MdbUser toReturn = userRepository.save(user.toMdbUser());
        return toReturn.toUser();
    }

    @Override
    public User edit(User user) {
        MdbUser toReturn = userRepository.save(user.toMdbUser());
        return toReturn.toUser();
    }

    @Override
    public User login(String email, String password) {
        User userReturned = null;

        MdbUser user = userRepository.findByEmail(email);

        if (userRepository.findByEmail(email) != null) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                userReturned = user.toUser();
            }
        }

        return userReturned;
    }


}
