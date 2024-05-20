package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.model.entities.singleTable.Animal;
import com.jimenahernando.herencia.repositories.AnimalRepository;
import com.jimenahernando.herencia.service.AnimalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimalServiceImpl implements AnimalService {

    private final AnimalRepository animalRepository;

    @Override
    public List<Animal> getAnimales() {
        return animalRepository.findAll();
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
}
