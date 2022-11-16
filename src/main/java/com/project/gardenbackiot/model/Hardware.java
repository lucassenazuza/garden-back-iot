package com.project.gardenbackiot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tb_hardware")
public class Hardware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_hardware", unique = true)
    private String nameHardware;
    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @OneToMany(mappedBy = "hardware", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Sensor> sensor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "name_model", name = "hardware_type")
    private HardwareType hardwareType;

    @PrePersist
    protected void prePersist() {
        createdDate = LocalDateTime.now();
    }
}



