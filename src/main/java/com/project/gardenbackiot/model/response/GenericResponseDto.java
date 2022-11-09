package com.project.gardenbackiot.model.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenericResponseDto {
    public String message;
}
