/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse;

import com.bostonHacks.DontTrashMyHouse.models.User;
import com.bostonHacks.DontTrashMyHouse.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Etienne
 */
@RestController
public class HomeController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("")
    public User index() {
        return userService.getUser("5be76ede1c9d4400005539bb");
    }
}
