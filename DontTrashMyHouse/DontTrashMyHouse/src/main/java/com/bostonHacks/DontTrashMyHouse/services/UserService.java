/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.models.MdbHouse;
import com.bostonHacks.DontTrashMyHouse.models.User;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Etienne
 */
@Service
interface UserService {

    public User getUser(String id);

    public User save(User user);
    
    public User edit(User user);
    
    public User login(String email, String password);
    
    public User findByEmail(String email);
    
}
