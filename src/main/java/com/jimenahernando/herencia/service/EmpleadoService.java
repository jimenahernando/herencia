package com.jimenahernando.herencia.service;

import com.jimenahernando.herencia.model.entities.Empleado;

import java.util.List;

public interface EmpleadoService {

    List<Empleado> getEmpleados();
    Empleado getEmpleadoById(Integer id);
}
