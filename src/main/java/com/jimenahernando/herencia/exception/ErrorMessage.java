package com.jimenahernando.herencia.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorMessage {

    private int code;
    private String message;
    private String description;
}
