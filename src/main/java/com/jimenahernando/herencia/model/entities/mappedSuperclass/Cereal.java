package com.jimenahernando.herencia.model.entities.mappedSuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cereal")
@Data
public class Cereal extends Producto {

    private String descripcion;
    private Long color;
}
