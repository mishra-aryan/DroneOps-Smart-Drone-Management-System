package com.example.drone_ops.controller;


import com.example.drone_ops.model.Drone;
import com.example.drone_ops.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")
public class DroneController {

    @Autowired
    private DroneService droneService;

    // Endpoint to retrieve all drones
    @GetMapping
    public ResponseEntity<List<Drone>> getAllDrones() {
        List<Drone> drones = droneService.getAllDrones();
        return new ResponseEntity<>(drones, HttpStatus.OK);
    }
    
    // Endpoint to retrieve a drone by ID
    @GetMapping("/{id}")
    public ResponseEntity<Drone> getDroneById(@PathVariable String id) {
        Drone drone = droneService.getDroneById(id);
        if (drone != null) {
            return new ResponseEntity<>(drone, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to add a new drone
    @PostMapping
    public ResponseEntity<Drone> addDrone(@RequestBody Drone drone) {
        Drone newDrone = droneService.addDrone(drone);
        return new ResponseEntity<>(newDrone, HttpStatus.CREATED);
    }

    // Endpoint to update an existing drone
    @PutMapping("/{id}")
    public ResponseEntity<Drone> updateDrone(@PathVariable String id, @RequestBody Drone drone) {
        Drone updatedDrone = droneService.updateDrone(id, drone);
        if (updatedDrone != null) {
            return new ResponseEntity<>(updatedDrone, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a drone
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDrone(@PathVariable String id) {
        droneService.deleteDrone(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
