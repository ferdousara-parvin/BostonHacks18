/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbHouse;
import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbUser;
import com.bostonHacks.DontTrashMyHouse.models.House;
import com.bostonHacks.DontTrashMyHouse.repository.HouseRepository;
import com.bostonHacks.DontTrashMyHouse.repository.UserRepository;
import com.bostonHacks.DontTrashMyHouse.util.ParameterStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author tlgmz
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    HouseRepository houseRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public House getHouse(String id) {
        MdbHouse toReturn = houseRepository.findById(id).orElse(null);
        MdbUser owner = userRepository.findById(toReturn.getOwner().toString()).orElse(null);
        return new House(toReturn.getId(), toReturn.getAddress(), toReturn.getLatitude(), toReturn.getLongitude(), toReturn.getAppNumber(), owner.toUser(), toReturn.isUsed(), toReturn.getRating(), toReturn.getCode(), toReturn.getLock());
    }

    @Override
    public List<House> getHouses() {
        return houseRepository.findAll().stream().map(mdb -> {
            MdbUser owner = userRepository.findById(mdb.getOwner().toString()).orElse(null);
            return new House(mdb.getId(), mdb.getAddress(), mdb.getLatitude(), mdb.getLongitude(),
                    mdb.getAppNumber(), ((owner != null) ? owner.toUser() : null), mdb.isUsed(), mdb.getRating(),
                    mdb.getCode(), mdb.getLock());
        }).collect(Collectors.toList());
    }

    @Override
    public boolean unlock(String houseId, String password) {
        MdbHouse house = houseRepository.findById(houseId).orElse(null);

        if (house == null) {
            return false;
        }

        RestTemplate rest = new RestTemplate();

        String response = rest.getForObject("http://10.192.200.179/PWD=" + password, String.class);

        return true;
    }
}
