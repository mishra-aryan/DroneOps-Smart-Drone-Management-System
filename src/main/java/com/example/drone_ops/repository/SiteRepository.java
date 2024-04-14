package com.example.drone_ops.repository;

import com.example.drone_ops.model.Site;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends MongoRepository<Site, String> {
    // You can define custom query methods here if needed
}