package com.jimenahernando.herencia.model.entities.joined_Inheritance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "coches")
@PrimaryKeyJoinColumn(name = "transporte")
@Data
@DiscriminatorValue("COCHE")
public class Coche extends Transporte {

    @Column(name = "nro_puertas")
    private Integer nroPuertas;

}