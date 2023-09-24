package com.fh.sensorapiapp.service;

import com.fh.sensorapiapp.model.Measurement;
import com.fh.sensorapiapp.model.SequenceGeneratorService;
import com.fh.sensorapiapp.repository.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MeasurementService {

    @Autowired
    private MeasurementRepository measurementRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public List<Measurement> getAllMeasurements() {
        return measurementRepository.findAll();
    }

    public Optional<Measurement> getMeasurementById(Long id) {
        return measurementRepository.findById(id);
    }

    public Measurement saveMeasurement(Measurement measurement) {
        measurement.setId(sequenceGeneratorService.generateSequence(Measurement.SEQUENCE_NAME));
        return measurementRepository.save(measurement);
    }

    public void deleteMeasurement(Long id) {
        measurementRepository.deleteById(id);
    }
}
