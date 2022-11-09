package com.project.gardenbackiot.repository;

import com.project.gardenbackiot.model.HardwareType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HardwareTypeRepository extends JpaRepository<HardwareType, Long> {
    HardwareType findByNameModel(String nameModel);
    Boolean existsByNameModel(String nameModel);
}
