package com.bostonHacks.DontTrashMyHouse.repository;


import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbHouse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepository extends MongoRepository<MdbHouse, String> {
}
