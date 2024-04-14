package com.example.drone_ops.service;

import com.example.drone_ops.model.Mission;

import java.util.List;

public interface MissionService {
    List<Mission> getAllMissions();
    Mission addMission(Mission mission);
    Mission updateMission(String id, Mission mission);
    void deleteMission(String id);
}