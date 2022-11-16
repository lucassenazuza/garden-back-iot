package com.project.gardenbackiot.model;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_hardware_type")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class HardwareType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_model")
    private String nameModel;

}
