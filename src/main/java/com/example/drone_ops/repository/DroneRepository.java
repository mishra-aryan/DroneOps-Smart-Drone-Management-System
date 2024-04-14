package com.example.drone_ops.repository;

import com.example.drone_ops.model.Drone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository extends MongoRepository<Drone, String> {
    // You can define custom query methods here if needed
}
