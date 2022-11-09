package com.project.gardenbackiot.controller;


import com.project.gardenbackiot.model.request.CreateHardwareRequestDto;
import com.project.gardenbackiot.model.request.CreateHardwareTypeRequestDto;
import com.project.gardenbackiot.model.response.GenericResponseDto;
import com.project.gardenbackiot.service.HardwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;


@RestController
@RequestMapping(value = "hardware")
@Transactional
public class HardwareController {
    @Autowired
    private HardwareService hardwareService;

    @PostMapping(value = "create", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity createHardware(@RequestBody @Valid CreateHardwareRequestDto createHardwareRequestDto) {
        hardwareService.createNewHardware(createHardwareRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(GenericResponseDto.builder().message("Hardware Created successfully").build());
    }
    @PostMapping(value = "type", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> createTypeHardware(@RequestBody @Valid CreateHardwareTypeRequestDto createHardwareTypeRequestDto) {
        hardwareService.createNewHardwareType(createHardwareTypeRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(GenericResponseDto.builder().message("Trype Created successfully").build());
    }

}
