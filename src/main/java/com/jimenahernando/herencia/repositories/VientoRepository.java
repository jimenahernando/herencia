package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.joined.Viento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VientoRepository extends JpaRepository<Viento, Integer> {
}
