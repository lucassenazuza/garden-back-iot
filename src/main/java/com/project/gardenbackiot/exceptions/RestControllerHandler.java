package com.project.gardenbackiot.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class RestControllerHandler {

//    @ExceptionHandler({})
//    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Não encontrado")
//    public void handleNotFound(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
//
//    @ExceptionHandler({ NoContentException.class })
//    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "Não há conteúdo para enviar para esta solicitação")
//    public void handleNoContent(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
//
//    @ExceptionHandler({ NullPointerException.class, DuplicateKeyException.class, IllegalStateException.class, PermissionDeniedDataAccessException.class })
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Erro interno no servidor")
//    public void handleInternalServerError(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
//
//    @ExceptionHandler({ IllegalArgumentException.class, NumberFormatException.class, InvalidFormatException.class,
//            DateTimeParseException.class })
//    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Requisição inválida")
//    public void handleBadRequest(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
//
//    @ExceptionHandler({ HttpServerErrorException.GatewayTimeout.class })
//    @ResponseStatus(value = HttpStatus.GATEWAY_TIMEOUT, reason = "Tempo limite da requisição excedido")
//    public void handleTimeout(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
//
//    @ExceptionHandler({ AsyncRequestTimeoutException.class })
//    @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "Serviço indisponível")
//    public void handleServiceUnavailable(Exception ex) {
//        log.error(ex.getMessage(), ex);
//    }
}