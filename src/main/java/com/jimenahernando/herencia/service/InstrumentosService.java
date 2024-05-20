package com.jimenahernando.herencia.service;

import com.jimenahernando.herencia.model.entities.joined.Instrumento;

import java.util.List;

public interface InstrumentosService {

    List<Instrumento> getInstrumentos();
    Instrumento saveInstrumento(Instrumento instrumento);
}
