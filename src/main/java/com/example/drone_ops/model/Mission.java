package com.example.drone_ops.model;

import java.util.Date;
import java.util.List;
import com.example.drone_ops.model.Waypoint;


public class Mission {

    private String name;
    private int altitude;
    private int speed;
    private List<Waypoint> waypoints;
    private Date createdAt;
    private Date updatedAt;

    // Constructors, getters, and setters

    public Mission() {
    }

    public Mission(String name, int altitude, int speed, List<Waypoint> waypoints, Date createdAt, Date updatedAt) {
        this.name = name;
        this.altitude = altitude;
        this.speed = speed;
        this.waypoints = waypoints;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters for name, altitude, speed, waypoints, createdAt, and updatedAt

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
