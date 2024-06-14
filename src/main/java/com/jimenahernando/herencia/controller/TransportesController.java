package com.jimenahernando.herencia.controller;

import com.jimenahernando.herencia.model.entities.joined_Inheritance.Transporte;
import com.jimenahernando.herencia.service.TransportesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/transportes")
@CrossOrigin("*")
@Slf4j
public class TransportesController {
    private final TransportesService transportesService;

    @GetMapping
    public ResponseEntity<List<Transporte>> getTransportes(){
        log.info("INIT -> getTransportes()");

        List<Transporte> transportes = transportesService.getTransportes();
        return new ResponseEntity<>(transportes, HttpStatus.OK);
    }

    @GetMapping("/tipos/{tipoTransporte}")
    public ResponseEntity<List<Transporte>> getTransportesByTipoTransporte(@PathVariable String tipoTransporte){
        log.info("INIT -> getTransportesByTipoTransporte()");

        List<Transporte> transportes = transportesService.getTransportesByTipoTransporte(tipoTransporte);
        return new ResponseEntity<>(transportes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Transporte> saveTransporte(@RequestBody Transporte transporte){
        log.info("INIT -> saveTransporte("+ transporte.toString() + ")");

        Transporte newTransporte = transportesService.saveTransporte(transporte);
        return new ResponseEntity<>(newTransporte, HttpStatus.OK);
    }
}
