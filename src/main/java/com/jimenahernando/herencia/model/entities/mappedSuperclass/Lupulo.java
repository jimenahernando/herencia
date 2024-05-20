package com.jimenahernando.herencia.model.entities.mappedSuperclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lupulo")
@Data
public class Lupulo extends Producto {
    private String pais;
}
