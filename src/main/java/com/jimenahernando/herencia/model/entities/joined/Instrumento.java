package com.jimenahernando.herencia.model.entities.joined;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "instrumentos")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipoInstrumento")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Viento.class, name = "viento"),
        @JsonSubTypes.Type(value = Percusion.class, name = "percusion"),
        @JsonSubTypes.Type(value = Cuerda.class, name = "cuerda")
})
@Data
public class Instrumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

}
