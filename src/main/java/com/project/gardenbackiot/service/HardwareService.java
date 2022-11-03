package com.project.gardenbackiot.service;

import com.project.gardenbackiot.model.Hardware;
import com.project.gardenbackiot.repository.HardwareRepository;
import org.springframework.stereotype.Service;

@Service
public class HardwareService {

    private HardwareRepository hardwareRepository;

    public HardwareService(HardwareRepository hardwareRepository) {
        this.hardwareRepository = hardwareRepository;
    }


    public void insertHardware(){
        hardwareRepository.save(Hardware.builder().name("teste").build());
    }

}
