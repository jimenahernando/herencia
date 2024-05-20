package com.jimenahernando.herencia.service;

import com.jimenahernando.herencia.model.entities.singleTable.Animal;

import java.util.List;

public interface AnimalService {

    List<Animal> getAnimales();
    Animal saveAnimal(Animal animal);
}
