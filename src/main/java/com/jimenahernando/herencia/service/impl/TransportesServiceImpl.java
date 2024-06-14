package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.model.entities.joined_Inheritance.Transporte;
import com.jimenahernando.herencia.repositories.TransporteRepository;
import com.jimenahernando.herencia.service.TransportesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransportesServiceImpl implements TransportesService {

    private final TransporteRepository transporteRepository;

    @Override
    public List<Transporte> getTransportes() {
        return transporteRepository.findAll();
    }

    @Override
    public List<Transporte> getTransportesByTipoTransporte(String tipoTransporte) {
        return transporteRepository.findByTipoTransporte(tipoTransporte);
    }

    @Override
    public Transporte saveTransporte(Transporte transporte) {
        return transporteRepository.saveAndFlush(transporte);
    }
}
