package com.project.gardenbackiot.controller;


import com.project.gardenbackiot.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hardware")
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    @PostMapping(value = "create")
    public ResponseEntity createHardware() {
        hardwareService.insertHardware();
        return ResponseEntity.ok().build();
    }
}
