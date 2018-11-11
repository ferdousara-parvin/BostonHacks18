/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse;

import com.bostonHacks.DontTrashMyHouse.models.User;
import com.bostonHacks.DontTrashMyHouse.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @RequestMapping("/getuser")
    public User getUser() {
        return userService.getUser("5be76ede1c9d4400005539bb");
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PostMapping("/edit")
    public User editUser(@RequestBody User user) {
        return userService.edit(user);
    }

    @RequestMapping(path="/login/{username}/{password}")
    public User login(@PathVariable("username") String username, @PathVariable("password") String password) 
    {
        return userService.login(username, password);
    }

}
