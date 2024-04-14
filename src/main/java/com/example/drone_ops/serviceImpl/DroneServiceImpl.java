package com.example.drone_ops.serviceImpl;

import com.example.drone_ops.model.Drone;
import com.example.drone_ops.repository.DroneRepository;
import com.example.drone_ops.service.DroneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneServiceImpl implements DroneService {

    @Autowired
    private DroneRepository droneRepository;

    @Override
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    @Override
    public Drone addDrone(Drone drone) {
        return droneRepository.save(drone);
    }

    @Override
    public Drone updateDrone(String id, Drone drone) {
        Drone existingDrone = droneRepository.findById(id).orElse(null);
        if (existingDrone != null) {
            // Update existing drone with new data
            existingDrone.setName(drone.getName());
            existingDrone.setDroneType(drone.getDroneType());
            existingDrone.setMakeName(drone.getMakeName());
            // Update other fields as needed

            // Save and return updated drone
            return droneRepository.save(existingDrone);
        } else {
            return null; // Drone not found
        }
    }

    @Override
    public void deleteDrone(String id) {
        droneRepository.deleteById(id);
    }

    @Override
    public Drone getDroneById(String id) {
        Optional<Drone> optionalDrone = droneRepository.findById(id);
        return optionalDrone.orElse(null); // Return the drone if found, or null if not found
    }
}