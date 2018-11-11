/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.models.House;
import com.bostonHacks.DontTrashMyHouse.repository.HouseRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tlgmz
 */

@Service
public class HouseServiceImpl implements HouseService
{
    @Autowired
    HouseRepository houseRepository;

    @Override
    public House getHouse(String id) {
        List<House> toReturn = houseRepository.findAll();
        System.out.println(Arrays.toString(toReturn.toArray()));
        return toReturn.get(0);
    }
    
    
}
