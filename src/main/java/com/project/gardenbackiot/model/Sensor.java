package com.project.gardenbackiot.model;

import com.project.gardenbackiot.model.enums.MeasurementUnitEnum;
import lombok.Builder;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "tb_sensor")
@Entity
@Builder
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sensor_name")
    private String sensorName;

    @ManyToOne
    @JoinColumn(name = "hardware_id")
    private Hardware hardware;

    @Column(name = "measurement_unit")
    @Enumerated(EnumType.STRING)
    private MeasurementUnitEnum measurementUnit;

}
