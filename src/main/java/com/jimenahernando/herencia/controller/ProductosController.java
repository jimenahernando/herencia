package com.jimenahernando.herencia.controller;

import com.jimenahernando.herencia.model.entities.mappedSuperclass.Cereal;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Lupulo;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Producto;
import com.jimenahernando.herencia.service.ProductosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
@Slf4j
public class ProductosController {

    private final ProductosService productosService;

    @GetMapping("/productos")
    public ResponseEntity<List<Producto>> getProductos(){
        log.info("INIT -> getProductos()");

        List<Producto> productos = productosService.getProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/cereales")
    public ResponseEntity<List<Cereal>> getCereales(){
        log.info("INIT -> getCereales()");

        List<Cereal> cereales = productosService.getCereales();
        return new ResponseEntity<>(cereales, HttpStatus.OK);
    }

    @PostMapping("/cereales")
    public ResponseEntity<Cereal> saveCereal(@RequestBody Cereal cereal){
        log.info("INIT -> saveCereal("+ cereal.toString() + ")");

        Cereal newCereal = productosService.saveCereal(cereal);
        return new ResponseEntity<>(newCereal, HttpStatus.OK);
    }

    @GetMapping("/lupulos")
    public ResponseEntity<List<Lupulo>> getLupulos(){
        log.info("INIT -> getLupulos()");

        List<Lupulo> lupulos = productosService.getLupulos();
        return new ResponseEntity<>(lupulos, HttpStatus.OK);
    }

    @PostMapping("/lupulos")
    public ResponseEntity<Lupulo> saveLupulo(@RequestBody Lupulo lupulo){
        log.info("INIT -> saveLupulo("+ lupulo.toString() + ")");

        Lupulo newLupulo = productosService.saveLupulo(lupulo);
        return new ResponseEntity<>(newLupulo, HttpStatus.OK);
    }
}
