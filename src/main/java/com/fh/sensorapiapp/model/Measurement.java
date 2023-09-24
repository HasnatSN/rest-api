package com.fh.sensorapiapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "measurements")
public class Measurement {

    public static final String SEQUENCE_NAME = "sensors_sequence";


    @Id
    private long id;

    @DBRef
    private Sensor sensor;

    private LocalDateTime timestamp;
    private Double temperature;
    private Double humidity;
}
