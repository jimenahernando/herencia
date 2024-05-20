package com.jimenahernando.herencia.model.entities.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "viento")
@PrimaryKeyJoinColumn(name = "instrumento")
@Data
public class Viento extends Instrumento {

    private String material;
}
