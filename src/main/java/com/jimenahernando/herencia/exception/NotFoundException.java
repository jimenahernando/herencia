package com.jimenahernando.herencia.exception;

import lombok.*;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
public class NotFoundException extends RuntimeException{

    private final int code;
    private final String message;
    private final String description;

    public NotFoundException(HttpStatus status, String description){
        this.code = status.value();
        this.message = status.name();
        this.description = description;
    }
}
