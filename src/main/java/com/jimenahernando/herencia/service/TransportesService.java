package com.jimenahernando.herencia.service;

import com.jimenahernando.herencia.model.entities.joined_Inheritance.Transporte;

import java.util.List;

public interface TransportesService {

    List<Transporte> getTransportes();
    List<Transporte> getTransportesByTipoTransporte(String tipoTransporte);
    Transporte saveTransporte(Transporte transporte);
}
