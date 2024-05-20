package com.jimenahernando.herencia.model.entities.singleTable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_animal", discriminatorType = DiscriminatorType.STRING)
@Table(name = "animales")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipoAnimal")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Mamifero.class, name = "Mamifero"),
        @JsonSubTypes.Type(value = Ave.class, name = "Ave")
})
@Data
public abstract class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer edad;
    private Boolean sexo;
}
