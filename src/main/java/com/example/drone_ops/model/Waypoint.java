package com.example.drone_ops.model;

public class Waypoint {

    private double altitude;
    private double latitude;
    private double longitude;

    // Constructors, getters, and setters

    public Waypoint() {
    }

    public Waypoint(double altitude, double latitude, double longitude) {
        this.altitude = altitude;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getters and setters for altitude, latitude, and longitude

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}