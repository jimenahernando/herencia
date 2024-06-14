package com.jimenahernando.herencia.model.entities.joined_Inheritance;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "transportes")
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        //include = JsonTypeInfo.As.PROPERTY,
        property = "tipoTransporte"
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Barco.class, name = "BARCO"),
        @JsonSubTypes.Type(value = Coche.class, name = "COCHE"),
        @JsonSubTypes.Type(value = Avion.class, name = "AVION")
})
@Data
public class Transporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    @JsonIgnore
    @Column(name = "tipo_transporte",insertable = false, updatable = false)
    private String tipoTransporte;

}