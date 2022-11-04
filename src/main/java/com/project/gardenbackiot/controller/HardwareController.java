package com.project.gardenbackiot.controller;


import com.project.gardenbackiot.model.request.CreateHardwareRequestDto;
import com.project.gardenbackiot.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "hardware")
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    @PostMapping(value = "create")
    public ResponseEntity createHardware(@RequestBody @Valid CreateHardwareRequestDto createHardwareRequestDto) {
        hardwareService.createNewHardware(createHardwareRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body("Hardware created successfully");
    }
}
