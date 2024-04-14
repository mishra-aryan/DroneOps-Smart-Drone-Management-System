package com.example.drone_ops.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.drone_ops.util.PositionDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.mongodb.client.model.geojson.Position;

@Document(collection = "sites")
public class Site {

    @Id
    private String id;

    private String siteName;
    
    @JsonDeserialize(using = PositionDeserializer.class)
    private CustomPosition position;

    // Constructors, getters, and setters

    public Site() {
    }

    public Site(String siteName, CustomPosition position) {
        this.siteName = siteName;
        this.position = position;
    }

    // Getters and setters for id, siteName, and position

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public CustomPosition getPosition() {
        return position;
    }

    public void setPosition(CustomPosition position) {
        this.position = position;
    }
}