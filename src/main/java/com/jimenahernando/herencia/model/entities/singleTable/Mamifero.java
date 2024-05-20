package com.jimenahernando.herencia.model.entities.singleTable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("Mamifero")
@Data
public class Mamifero extends Animal {

    @Column(name = "cantidad_mamas")
    private Integer cantidadMamas;
}
