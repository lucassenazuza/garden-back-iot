package com.project.gardenbackiot.mapper;

import com.project.gardenbackiot.model.Hardware;
import com.project.gardenbackiot.model.response.HardwareReponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface HardwareMapper {

    HardwareMapper INSTANCE = Mappers.getMapper( HardwareMapper.class );

    @Mapping(source = "nameHardware", target = "nameDto")
    @Mapping(source = "hardwareType.nameModel", target = "hardwareType")
    HardwareReponseDto of(Hardware hardware);
}