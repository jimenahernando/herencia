package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.joined.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer> {
}
