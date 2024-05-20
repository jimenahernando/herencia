package com.jimenahernando.herencia.controller;

import com.jimenahernando.herencia.model.entities.joined.Cuerda;
import com.jimenahernando.herencia.model.entities.joined.Instrumento;
import com.jimenahernando.herencia.model.entities.joined.Viento;
import com.jimenahernando.herencia.service.InstrumentosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/instrumentos")
@CrossOrigin("*")
@Slf4j
public class InstrumentosController {

    private final InstrumentosService instrumentosService;

    @GetMapping
    public ResponseEntity<List<Instrumento>> getInstrumentos(){
        log.info("INIT -> getInstrumentos()");

        List<Instrumento> instrumentos = instrumentosService.getInstrumentos();
        return new ResponseEntity<>(instrumentos, HttpStatus.OK);
    }

    @GetMapping("/viento")
    public ResponseEntity<List<Viento>> getInstrumentosDeViento(){
        log.info("INIT -> getInstrumentosDeViento()");

        List<Viento> instrumentosDeViento= instrumentosService.getInstrumentosDeViento();
        return new ResponseEntity<>(instrumentosDeViento, HttpStatus.OK);
    }

    @GetMapping("/cuerda")
    public ResponseEntity<List<Cuerda>> getInstrumentosDeCuerda(){
        log.info("INIT -> getInstrumentosDeCuerda()");

        List<Cuerda> instrumentosDeCuerda= instrumentosService.getInstrumentosDeCuerda();
        return new ResponseEntity<>(instrumentosDeCuerda, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Instrumento> saveInstrumento(@RequestBody Instrumento instrumento){
        log.info("INIT -> saveInstrumento("+ instrumento.toString() + ")");

        Instrumento newInstrumento = instrumentosService.saveInstrumento(instrumento);
        return new ResponseEntity<>(newInstrumento, HttpStatus.OK);
    }
}
