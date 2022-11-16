package com.project.gardenbackiot.exceptions;

import com.project.gardenbackiot.model.response.GenericErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.time.LocalDateTime;

@Slf4j
@RestControllerAdvice
public class RestControllerHandler {

    @ExceptionHandler({InternalError.class})
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error")
    public void internalServerError(Exception ex) {
        log.error(ex.getMessage(), ex);
    }

    @ExceptionHandler({SQLException.class})
    //@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "SQL Exception")
    public ResponseEntity<?> sqlException(Exception ex) {
        log.error(ex.getMessage(), ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(GenericErrorMessage.builder()
                        .localDateTime(LocalDateTime.now())
                        .message(ex.getMessage())
                        .build());
    }

}