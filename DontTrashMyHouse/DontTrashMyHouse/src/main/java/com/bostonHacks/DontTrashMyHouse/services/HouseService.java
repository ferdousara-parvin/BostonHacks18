/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.services;

import com.bostonHacks.DontTrashMyHouse.models.MdbHouse;
import java.util.List;

/**
 *
 * @author tlgmz
 */
interface HouseService {
    public MdbHouse getHouse(String id);
    
    public List<MdbHouse> getHouses();

    boolean unlock(String houseId, String password);
}
