/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse;

import com.bostonHacks.DontTrashMyHouse.models.House;
import com.bostonHacks.DontTrashMyHouse.models.User;
import com.bostonHacks.DontTrashMyHouse.services.HouseServiceImpl;
import com.bostonHacks.DontTrashMyHouse.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Etienne
 */
@CrossOrigin()
@RestController
public class ApiController {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    HouseServiceImpl houseService;

    @RequestMapping("/getuser/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
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

    @GetMapping("/unlock/{password}")
    public @ResponseBody
    boolean unlockDoor(@PathVariable String houseId, @PathVariable String password) {
        return houseService.unlock(houseId, password);
    }

    @RequestMapping("/gethouse/{id}")
    public House getHouse(@PathVariable("id") String id) {
        return houseService.getHouse(id);
    }

    @RequestMapping("/gethouses")
    public List<House> getHouses() {
        return houseService.getHouses();
    }

}
