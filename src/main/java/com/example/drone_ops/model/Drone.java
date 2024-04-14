package com.example.drone_ops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "drones")
public class Drone {

    @Id
    private String id;

    private String name;
    private String droneType;
    private String makeName;

    // Constructors, getters, and setters

    public Drone() {
    }

    public Drone(String name, String droneType, String makeName) {
        this.name = name;
        this.droneType = droneType;
        this.makeName = makeName;
    }

    // Getters and setters for id, name, droneType, and makeName

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDroneType() {
        return droneType;
    }

    public void setDroneType(String droneType) {
        this.droneType = droneType;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }
    

}
