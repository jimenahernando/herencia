package com.jimenahernando.herencia.controller;

import com.jimenahernando.herencia.model.entities.Empleado;
import com.jimenahernando.herencia.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/empleados")
@CrossOrigin("*")
@Slf4j
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<Empleado>> getEmpleados(){
        log.info("INIT -> getEmpleados()");

        List<Empleado> beerStyles = empleadoService.getEmpleados();
        return new ResponseEntity<>(beerStyles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpleadoById(@PathVariable Integer id){
        log.info("INIT -> getEmpleadoById("+ id + ")");

        Empleado empleado = empleadoService.getEmpleadoById(id);
        return new ResponseEntity<>(empleado, HttpStatus.OK);
    }
}
