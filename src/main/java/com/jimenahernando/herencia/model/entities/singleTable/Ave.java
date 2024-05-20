package com.jimenahernando.herencia.model.entities.singleTable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("Ave")
@Data
public class Ave extends Animal {

    @Column(name = "color_plumaje")
    private String colorPlumaje;
}
