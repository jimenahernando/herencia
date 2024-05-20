package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.mappedSuperclass.Cereal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CerealRepository extends JpaRepository<Cereal, Integer> {
}
