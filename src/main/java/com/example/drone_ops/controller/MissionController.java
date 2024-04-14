package com.example.drone_ops.controller;

import com.example.drone_ops.model.Mission;
import com.example.drone_ops.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/missions")
public class MissionController {

    @Autowired
    private MissionService missionService;

    // Endpoint to retrieve all missions
    @GetMapping
    public ResponseEntity<List<Mission>> getAllMissions() {
        List<Mission> missions = missionService.getAllMissions();
        return new ResponseEntity<>(missions, HttpStatus.OK);
    }

    // Endpoint to add a new mission
    @PostMapping
    public ResponseEntity<Mission> addMission(@RequestBody Mission mission) {
        Mission newMission = missionService.addMission(mission);
        return new ResponseEntity<>(newMission, HttpStatus.CREATED);
    }

    // Endpoint to update an existing mission
    @PutMapping("/{id}")
    public ResponseEntity<Mission> updateMission(@PathVariable String id, @RequestBody Mission mission) {
        Mission updatedMission = missionService.updateMission(id, mission);
        if (updatedMission != null) {
            return new ResponseEntity<>(updatedMission, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint to delete a mission
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMission(@PathVariable String id) {
        missionService.deleteMission(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}