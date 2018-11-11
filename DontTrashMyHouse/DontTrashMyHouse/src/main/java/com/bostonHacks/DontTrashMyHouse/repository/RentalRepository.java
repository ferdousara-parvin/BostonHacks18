package com.bostonHacks.DontTrashMyHouse.repository;

import com.bostonHacks.DontTrashMyHouse.models.Rental;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentalRepository extends MongoRepository<Rental, String> {
}
