package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.exception.NotFoundException;
import com.jimenahernando.herencia.model.entities.Empleado;
import com.jimenahernando.herencia.repositories.EmpleadoRepository;
import com.jimenahernando.herencia.service.EmpleadoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmpleadoServiceImpl implements EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> getEmpleados() {
        List<Empleado> empleados = empleadoRepository.findAll();
        if (empleados.isEmpty()) {
            throw new NotFoundException(HttpStatus.NOT_FOUND, "No hay empleados");
        }
        return empleados;
    }

    @Override
    public Empleado getEmpleadoById(Integer id) {
        Optional<Empleado> optEmpleado = empleadoRepository.findById(id);
        if (optEmpleado.isEmpty()) {
            throw new NotFoundException(HttpStatus.NOT_FOUND, "No se encuentra el empleado");
        }
        return optEmpleado.get();
    }
}
