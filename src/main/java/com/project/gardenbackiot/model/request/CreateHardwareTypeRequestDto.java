package com.project.gardenbackiot.model.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CreateHardwareTypeRequestDto {
    @NotNull(message = "Type required")
    @NotBlank
    private String type;
}