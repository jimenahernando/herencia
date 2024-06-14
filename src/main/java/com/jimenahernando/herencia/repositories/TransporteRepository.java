package com.jimenahernando.herencia.repositories;

import com.jimenahernando.herencia.model.entities.joined_Inheritance.Transporte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransporteRepository extends JpaRepository<Transporte, Integer> {

    List<Transporte> findByTipoTransporte(String tipoTransporte);
}
