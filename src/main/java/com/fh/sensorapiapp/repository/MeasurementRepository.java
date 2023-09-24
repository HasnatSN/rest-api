package com.fh.sensorapiapp.repository;

import com.fh.sensorapiapp.model.Measurement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MeasurementRepository extends MongoRepository<Measurement, Long> {
}
