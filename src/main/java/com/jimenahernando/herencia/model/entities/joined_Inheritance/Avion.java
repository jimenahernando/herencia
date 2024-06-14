package com.jimenahernando.herencia.model.entities.joined_Inheritance;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "aviones")
@PrimaryKeyJoinColumn(name = "transporte")
@Data
@DiscriminatorValue("AVION")
public class Avion extends Transporte {

    @Column(name = "nro_salidas_de_emergencia")
    private Integer nroSalidasDeEmergencia;

}