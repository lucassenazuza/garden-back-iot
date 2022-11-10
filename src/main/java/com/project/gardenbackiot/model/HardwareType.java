package com.project.gardenbackiot.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_hardware_type")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HardwareType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_model")
    private String nameModel;

}
