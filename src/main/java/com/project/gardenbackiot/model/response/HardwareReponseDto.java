package com.project.gardenbackiot.model.response;


import com.project.gardenbackiot.model.Sensor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class HardwareReponseDto {
    private Long id;

    private String nameDto;

    private LocalDateTime createdDate;

    private List<Sensor> sensor;

    private String hardwareType;

}
