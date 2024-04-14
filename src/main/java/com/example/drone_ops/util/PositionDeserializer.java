package com.example.drone_ops.util;

import com.example.drone_ops.model.CustomPosition;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mongodb.client.model.geojson.Position;

import java.io.IOException;

public class PositionDeserializer extends JsonDeserializer<CustomPosition> {

    @Override
    public CustomPosition deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        double longitude = node.get("longitude").asDouble();
        double latitude = node.get("latitude").asDouble();
        return new CustomPosition(longitude, latitude);
    }
}

