package com.jimenahernando.herencia.model.entities.joined_Inheritance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "barcos")
@PrimaryKeyJoinColumn(name = "transporte")
@Data
@DiscriminatorValue("BARCO")
public class Barco extends Transporte {

    @Column(name = "nro_butacas")
    private Integer nroButacas;

}