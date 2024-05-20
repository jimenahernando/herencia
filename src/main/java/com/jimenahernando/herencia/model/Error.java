package com.jimenahernando.herencia.model;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Error {

    private int code;
    private String message;
    private String description;

    public Error(HttpStatus status, String description) {
        this.code = status.value();
        this.message = status.name();
        this.description = description;
    }
}
