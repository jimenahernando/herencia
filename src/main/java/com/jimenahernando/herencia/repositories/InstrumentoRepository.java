package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.joined.Cuerda;
import com.jimenahernando.herencia.model.entities.joined.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstrumentoRepository extends JpaRepository<Instrumento, Integer> {

    @Query("SELECT c FROM Cuerda c")
    List<Cuerda> findAllCuerda();
}
