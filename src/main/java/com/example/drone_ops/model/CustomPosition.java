package com.example.drone_ops.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.example.drone_ops.util.PositionDeserializer;

@JsonDeserialize(using = PositionDeserializer.class)
public class CustomPosition {
    private double longitude;
    private double latitude;

    // Default constructor
    public CustomPosition() {
    }

    // Constructor with longitude and latitude parameters
    public CustomPosition(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    // Getters and setters
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
