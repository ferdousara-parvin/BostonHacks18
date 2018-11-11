/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.models.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author Etienne
 */
@Service
interface UserService {
      public User getUser(String id);
}
