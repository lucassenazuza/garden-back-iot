package com.project.gardenbackiot.service;

import com.project.gardenbackiot.model.Hardware;
import com.project.gardenbackiot.model.Sensor;
import com.project.gardenbackiot.model.enums.MeasurementUnitEnum;
import com.project.gardenbackiot.model.request.CreateHardwareRequestDto;
import com.project.gardenbackiot.repository.HardwareRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
public class HardwareService {

    private HardwareRepository hardwareRepository;

    public HardwareService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }


    public void createNewHardware (CreateHardwareRequestDto createHardwareRequestDto){
        Hardware hardware = Hardware.builder().name("teste").build();
        Sensor sensorDHT11 = Sensor.builder().sensorName("DHT11").hardware(hardware).measurementUnit(MeasurementUnitEnum.AIR_TEMPERATURE).build();
        Sensor sensorDHT11Air = Sensor.builder().sensorName("DHT11").hardware(hardware).measurementUnit(MeasurementUnitEnum.AIR_HUMIDITY).build();
        hardware.setSensor(Arrays.asList(sensorDHT11,sensorDHT11Air));
        hardwareRepository.save(hardware);
    }

}
