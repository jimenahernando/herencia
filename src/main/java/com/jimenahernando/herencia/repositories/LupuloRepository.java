package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.mappedSuperclass.Lupulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LupuloRepository  extends JpaRepository<Lupulo, Integer> {
}
