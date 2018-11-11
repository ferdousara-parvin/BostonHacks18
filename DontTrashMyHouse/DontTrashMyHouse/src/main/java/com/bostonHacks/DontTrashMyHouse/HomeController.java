/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse;

import com.bostonHacks.DontTrashMyHouse.models.User;
import com.bostonHacks.DontTrashMyHouse.services.HouseServiceImpl;
import com.bostonHacks.DontTrashMyHouse.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Etienne
 */
@RestController
public class HomeController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    HouseServiceImpl houseService;

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


    @RequestMapping(path = "/login/{email}/{password}")
    public User login(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.login(email, password);
    }

    @PostMapping("/unlock/{houseId}")
    public @ResponseBody
    boolean unlockDoor(@PathVariable String houseId, @RequestBody String password) {
        return houseService.unlock(houseId, password);
    }

}
