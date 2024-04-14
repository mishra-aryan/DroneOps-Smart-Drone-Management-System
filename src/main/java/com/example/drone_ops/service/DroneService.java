package com.example.drone_ops.service;

import com.example.drone_ops.model.Drone;

import java.util.List;

public interface DroneService {
    List<Drone> getAllDrones();
    Drone addDrone(Drone drone);
    Drone updateDrone(String id, Drone drone);
    void deleteDrone(String id);
	Drone getDroneById(String id);
}