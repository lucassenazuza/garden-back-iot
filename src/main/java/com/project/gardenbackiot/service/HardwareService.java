package com.project.gardenbackiot.service;

import com.project.gardenbackiot.model.HardwareType;
import com.project.gardenbackiot.model.request.CreateHardwareRequestDto;
import com.project.gardenbackiot.model.request.CreateHardwareTypeRequestDto;
import com.project.gardenbackiot.repository.HardwareRepository;
import com.project.gardenbackiot.repository.HardwareTypeRepository;
import com.project.gardenbackiot.repository.SensorRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class HardwareService {

    private final HardwareRepository hardwareRepository;
    private final HardwareTypeRepository hardwareTypeRepository;
    private final SensorRepository sensorRepository;

    public void createNewHardware (CreateHardwareRequestDto createHardwareRequestDto){
        String hardwareTypeStr = Optional.of(createHardwareRequestDto.getHardwareType()).orElse(null);
        String sensorStr = Optional.of(createHardwareRequestDto.getSensorName()).orElse(null);
        Optional<HardwareType> hardwareType = null;
        Optional<Sensor> sensor = null;

        if(hardwareTypeStr != null){
            hardwareType = Optional.of(hardwareTypeRepository.findBynameModel(hardwareTypeStr));
        }
        if(createHardwareRequestDto.getSensorName() != null){
            sensor = Optional.of(sensorRepository.findByNameSensor(createHardwareRequestDto.getSensorName()));
        }

        Hardware hardware = Hardware.builder().name(createHardwareRequestDto.getName())
                .hardwareType(hardwareType.orElse(null))
                .sensor(sensor.orElse(null))

                .build();

        hardwareRepository.save(hardware);
    }

    public void createNewHardwareType(CreateHardwareTypeRequestDto createHardwareTypeRequestDto) {
       HardwareType hardwareType = HardwareType.builder().nameModel(createHardwareTypeRequestDto.getType()).build();
       hardwareTypeRepository.save(hardwareType);
    }
}
