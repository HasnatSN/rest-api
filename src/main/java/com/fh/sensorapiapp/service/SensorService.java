package com.fh.sensorapiapp.service;

import com.fh.sensorapiapp.model.Sensor;
import com.fh.sensorapiapp.model.SequenceGeneratorService;
import com.fh.sensorapiapp.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    public List<Sensor> getAllSensors() {
        return sensorRepository.findAll();
    }

    public Optional<Sensor> getSensorById(Long id) {
        return sensorRepository.findById(id);
    }

    public Sensor saveSensor(Sensor sensor) {
        sensor.setId(sequenceGeneratorService.generateSequence(Sensor.SEQUENCE_NAME));
        return sensorRepository.save(sensor);
    }

    public void deleteSensor(Long id) {
        sensorRepository.deleteById(id);
    }
}
