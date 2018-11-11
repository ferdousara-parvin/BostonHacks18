/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbHouse;
import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbRental;
import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbUser;
import com.bostonHacks.DontTrashMyHouse.models.House;
import com.bostonHacks.DontTrashMyHouse.models.Rental;
import com.bostonHacks.DontTrashMyHouse.repository.HouseRepository;
import com.bostonHacks.DontTrashMyHouse.repository.RentalRepository;
import java.util.Arrays;
import java.util.List;

import com.bostonHacks.DontTrashMyHouse.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tlgmz
 */
public class RentalServiceImpl implements RentalService {
    
    @Autowired
    RentalRepository rentalRepository;

    @Autowired
    HouseRepository houseRepository;

    @Autowired
    UserRepository userRepository;


    @Override
    public Rental getRental(String id) {
        MdbRental mdbRental = rentalRepository.findById(id).orElse(null);
        MdbHouse mdbHouse = houseRepository.findById(mdbRental.getHouse().toString()).orElse(null);
        MdbUser mdbUser = userRepository.findById(mdbRental.getRenter().toString()).orElse(null);

        return new Rental(mdbRental.getId(), mdbHouse.toHouse(mdbHouse,userRepository) ,mdbUser.toUser(), mdbRental.getStartDate(), mdbRental.getEndDate(), mdbRental.getImageurl());
    }
    
}
