package com.project.gardenbackiot.model.request;


import com.project.gardenbackiot.model.Sensor;
import com.project.gardenbackiot.model.enums.MeasurementUnitEnum;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;


@Data
public class CreateHardwareRequestDto {

    @NotNull(message = "name required")
    @NotBlank
    private String name;
    @NotNull
    private HashMap<String, MeasurementUnitEnum> sensors;

    private String hardwareType;
}
