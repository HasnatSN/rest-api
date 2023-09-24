package com.fh.sensorapiapp.repository;

import com.fh.sensorapiapp.model.Sensor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorRepository extends MongoRepository<Sensor, Long> {
}
