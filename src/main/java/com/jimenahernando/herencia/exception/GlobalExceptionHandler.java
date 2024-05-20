package com.jimenahernando.herencia.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(NotFoundException ex) {
        ErrorMessage message = ErrorMessage.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .message(ex.getMessage())
                .description(ex.getDescription())
                .build();

        log.error("ERROR -> " + message.toString());
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
