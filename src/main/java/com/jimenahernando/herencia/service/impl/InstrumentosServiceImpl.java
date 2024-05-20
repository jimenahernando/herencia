package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.model.entities.joined.Cuerda;
import com.jimenahernando.herencia.model.entities.joined.Instrumento;
import com.jimenahernando.herencia.model.entities.joined.Viento;
import com.jimenahernando.herencia.repositories.InstrumentoRepository;
import com.jimenahernando.herencia.repositories.VientoRepository;
import com.jimenahernando.herencia.service.InstrumentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstrumentosServiceImpl implements InstrumentosService {

    private final InstrumentoRepository instrumentoRepository;
    private final VientoRepository vientoRepository;

    @Override
    public List<Instrumento> getInstrumentos() {
        return instrumentoRepository.findAll();
    }

    @Override
    public Instrumento saveInstrumento(Instrumento instrumento) {
        return instrumentoRepository.saveAndFlush(instrumento);
    }

    @Override
    public List<Viento> getInstrumentosDeViento() {
        return vientoRepository.findAll();
    }

    @Override
    public List<Cuerda> getInstrumentosDeCuerda() {
        return instrumentoRepository.findAllCuerda();
    }
}
