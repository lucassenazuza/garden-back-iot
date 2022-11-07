package com.project.gardenbackiot.model.request;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Data
public class CreateHardwareRequestDto {

    @NotNull(message = "name required")
    @NotBlank
    private String name;
    private String sensorName;
    private List<String> measurementUnit;

}
