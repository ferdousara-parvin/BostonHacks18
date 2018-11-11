package com.bostonHacks.DontTrashMyHouse.repository;

import com.bostonHacks.DontTrashMyHouse.mdbModels.MdbRental;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentalRepository extends MongoRepository<MdbRental, String> {
}
