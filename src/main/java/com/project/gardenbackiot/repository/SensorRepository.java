package com.project.gardenbackiot.repository;

import com.project.gardenbackiot.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Long> {
    Sensor findBySensorName(String nameSensor);
}
