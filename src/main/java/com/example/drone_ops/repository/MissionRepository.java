package com.example.drone_ops.repository;

import com.example.drone_ops.model.Mission;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends MongoRepository<Mission, String> {
    // You can define custom query methods here if needed
}