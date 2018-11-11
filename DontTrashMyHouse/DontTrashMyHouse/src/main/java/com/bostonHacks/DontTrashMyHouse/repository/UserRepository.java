/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bostonHacks.DontTrashMyHouse.repository;

import com.bostonHacks.DontTrashMyHouse.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Etienne
 */
@Repository
public interface UserRepository extends MongoRepository<User, String>{
    User findByUsername(String username);
}
