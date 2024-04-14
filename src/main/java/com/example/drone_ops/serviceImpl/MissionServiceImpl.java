package com.example.drone_ops.serviceImpl;

import com.example.drone_ops.model.Mission;
import com.example.drone_ops.repository.MissionRepository;
import com.example.drone_ops.service.MissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionServiceImpl implements MissionService {

    @Autowired
    private MissionRepository missionRepository;

    @Override
    public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    @Override
    public Mission addMission(Mission mission) {
        return missionRepository.save(mission);
    }

    @Override
    public Mission updateMission(String id, Mission mission) {
        Mission existingMission = missionRepository.findById(id).orElse(null);
        if (existingMission != null) {
            // Update existing mission with new data
            existingMission.setName(mission.getName());
            existingMission.setWaypoints(mission.getWaypoints());
            // Update other fields as needed

            // Save and return updated mission
            return missionRepository.save(existingMission);
        } else {
            return null; // Mission not found
        }
    }

    @Override
    public void deleteMission(String id) {
        missionRepository.deleteById(id);
    }
}