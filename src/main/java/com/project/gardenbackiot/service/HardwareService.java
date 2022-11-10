package com.project.gardenbackiot.service;

import com.project.gardenbackiot.model.Hardware;
import com.project.gardenbackiot.model.HardwareType;
import com.project.gardenbackiot.model.Sensor;
import com.project.gardenbackiot.model.enums.MeasurementUnitEnum;
import com.project.gardenbackiot.model.request.CreateHardwareRequestDto;
import com.project.gardenbackiot.model.request.CreateHardwareTypeRequestDto;
import com.project.gardenbackiot.repository.HardwareRepository;
import com.project.gardenbackiot.repository.HardwareTypeRepository;
import com.project.gardenbackiot.repository.SensorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class HardwareService {

    private final HardwareRepository hardwareRepository;
    private final HardwareTypeRepository hardwareTypeRepository;
    private final SensorRepository sensorRepository;

    public void createNewHardware(CreateHardwareRequestDto createHardwareRequestDto) {
        String hardwareTypeStr = Optional.of(createHardwareRequestDto.getHardwareType()).orElse(null);

        HardwareType hardwareType = null;

        if (hardwareTypeRepository.existsByNameModel(createHardwareRequestDto.getHardwareType())) {
            hardwareType = hardwareTypeRepository.findByNameModel(hardwareTypeStr);
        } else {
            hardwareType = hardwareTypeRepository.save(HardwareType.builder().nameModel(createHardwareRequestDto.getHardwareType()).build());
        }

        HashMap<String, MeasurementUnitEnum> sensorsJson = createHardwareRequestDto.getSensors();
        List<Sensor> sensors = new ArrayList<>();
        sensorsJson.forEach((key, value) -> {
            sensors.add(Sensor.builder().sensorName(key).measurementUnit(value).build());
        });

        Hardware hardware = Hardware.builder().nameHardware(createHardwareRequestDto.getNameHardware())
                .hardwareType(hardwareType)
                .sensor(sensors)
                .build();

        hardwareRepository.save(hardware);
    }

    public void createNewHardwareType(CreateHardwareTypeRequestDto createHardwareTypeRequestDto) {
        HardwareType hardwareType = HardwareType.builder().nameModel(createHardwareTypeRequestDto.getType()).build();
        hardwareTypeRepository.save(hardwareType);
    }
}
