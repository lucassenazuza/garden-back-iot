package com.project.gardenbackiot.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Data
@Table(name = "tb_hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "hardware", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Sensor> sensor;

    @OneToOne
    @JoinColumn(name = "hardware_type", referencedColumnName = "name_model")
    private HardwareType hardwareType;

    @PrePersist
    protected void prePersist() {
        createdDate = LocalDateTime.now();
    }
}
