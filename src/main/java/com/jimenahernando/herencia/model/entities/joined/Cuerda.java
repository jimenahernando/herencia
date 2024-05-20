package com.jimenahernando.herencia.model.entities.joined;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cuerda")
@PrimaryKeyJoinColumn(name = "instrumento")
@Data
public class Cuerda extends Instrumento {

    @Column(name = "cantidad_cuerdas")
    private Integer cantidadCuerdas;
    @Column(name = "material_cuerda")
    private String materialCuerda;
}
