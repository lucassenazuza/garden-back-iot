package com.project.gardenbackiot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.gardenbackiot.model.enums.MeasurementUnitEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Table(name = "tb_sensor")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "sensor_name")
    private String sensorName;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "hardware_id")
    private Hardware hardware;

    @Column(name = "measurement_unit")
    @Enumerated(EnumType.STRING)
    private MeasurementUnitEnum measurementUnit;

}
