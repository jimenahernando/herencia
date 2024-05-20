package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.singleTable.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
