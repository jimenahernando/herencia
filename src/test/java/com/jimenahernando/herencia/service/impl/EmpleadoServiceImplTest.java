package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.model.entities.Empleado;
import com.jimenahernando.herencia.repositories.EmpleadoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class EmpleadoServiceImplTest {

    @Mock
    EmpleadoRepository empleadoRepository;

    @InjectMocks
    EmpleadoServiceImpl beerServiceImpl;

    List<Empleado> empleados;


    @BeforeEach
    public void setUp(){
        empleados = new ArrayList<>();

    }
}