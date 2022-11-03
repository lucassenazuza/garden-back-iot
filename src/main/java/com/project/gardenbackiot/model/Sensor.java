package com.project.gardenbackiot.model;

import javax.persistence.*;
import java.util.List;

@Table(name = "tb_sensor")
@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "sensor_name")
    private String sensorName;
    @Enumerated(EnumType.STRING)
    private MeasurementUnit measurementUnitList;

}
