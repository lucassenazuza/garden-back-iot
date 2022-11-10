package com.project.gardenbackiot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "tb_hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameHardware")
    private String nameHardware;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "hardware", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private List<Sensor> sensor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "name_model")
    private HardwareType hardwareType;

    @PrePersist
    protected void prePersist() {
        createdDate = LocalDateTime.now();
    }
}
