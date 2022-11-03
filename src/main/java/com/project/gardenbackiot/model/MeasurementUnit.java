package com.project.gardenbackiot.model;

import javax.persistence.Table;

@Table(name = "enum_measurement_unit")
public enum MeasurementUnit {
    AIR_TEMPERATURE,
    AIR_HUMIDITY,
    SOIL_TEMPERATURE,
    SOIL_HUMIDITY
}
