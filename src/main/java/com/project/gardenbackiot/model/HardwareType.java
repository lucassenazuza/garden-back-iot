package com.project.gardenbackiot.model;


import javax.persistence.*;

@Entity()
@Table(name = "tb_hardware_type")
public class HardwareType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name_model")
    private String nameModel;

    @OneToOne(mappedBy = "hardwareType")
    private Hardware hardware;

}
