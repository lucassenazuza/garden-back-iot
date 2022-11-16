package com.project.gardenbackiot.model.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class GenericErrorMessage {
    public LocalDateTime localDateTime;
    public String message;
}
