/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.models.Rental;
import com.bostonHacks.DontTrashMyHouse.repository.RentalRepository;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author tlgmz
 */
public class RentalServiceImpl implements RentalService {
    
    @Autowired
    RentalRepository rentalRepository;

    @Override
    public Rental getRental(String id) {
        List<Rental> toReturn = rentalRepository.findAll();
        System.out.println(Arrays.toString(toReturn.toArray()));
        return toReturn.get(0);
    }
    
}
