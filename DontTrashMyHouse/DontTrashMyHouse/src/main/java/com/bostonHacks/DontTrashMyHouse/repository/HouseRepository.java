package com.bostonHacks.DontTrashMyHouse.repository;

import com.bostonHacks.DontTrashMyHouse.models.House;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HouseRepository extends MongoRepository<House, String> {
}
