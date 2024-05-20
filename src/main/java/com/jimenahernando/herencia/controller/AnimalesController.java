package com.jimenahernando.herencia.controller;

import com.jimenahernando.herencia.model.entities.singleTable.Animal;
import com.jimenahernando.herencia.service.AnimalService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
@Slf4j
public class AnimalesController {

    private final AnimalService animalService;

    @GetMapping("/animales")
    public ResponseEntity<List<Animal>> getAnimales(){
        log.info("INIT -> getAnimales()");

        List<Animal> animales = animalService.getAnimales();
        return new ResponseEntity<>(animales, HttpStatus.OK);
    }

    @PostMapping("/animales")
    public ResponseEntity<Animal> saveAnimal(@RequestBody Animal animal){
        log.info("INIT -> saveAnimal("+ animal.toString() + ")");

        Animal newAnimal = animalService.saveAnimal(animal);
        return new ResponseEntity<>(newAnimal, HttpStatus.OK);
    }
}
