package com.fh.sensorapiapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sensors")
public class Sensor {

    public static final String SEQUENCE_NAME = "sensors_sequence";

    @Id
    private Long id;

    private String name;
    private String location;
    private Boolean isActive;
    private SensorType type;
}

enum SensorType {
    OUTDOOR, INDOOR, WATER
}