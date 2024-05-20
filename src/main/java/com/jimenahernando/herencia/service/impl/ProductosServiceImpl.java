package com.jimenahernando.herencia.service.impl;

import com.jimenahernando.herencia.model.entities.mappedSuperclass.Cereal;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Lupulo;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Producto;
import com.jimenahernando.herencia.repositories.CerealRepository;
import com.jimenahernando.herencia.repositories.LupuloRepository;
import com.jimenahernando.herencia.service.ProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class ProductosServiceImpl implements ProductosService {

    private final CerealRepository cerealRepository;
    private final LupuloRepository lupuloRepository;

    @Override
    public List<Cereal> getCereales() {
        return cerealRepository.findAll();
    }

    @Override
    public List<Lupulo> getLupulos() {
        return lupuloRepository.findAll();
    }

    @Override
    public List<Producto> getProductos() {
        List<Cereal> cereales = cerealRepository.findAll();
        List<Lupulo> lupulos = lupuloRepository.findAll();
        return Stream.concat(cereales.stream(), lupulos.stream())
                .map(producto -> new Producto(producto.getId(), producto.getNombre()) {})
                .collect(Collectors.toList());
    }

    @Override
    public Cereal saveCereal(Cereal cereal) {
        return cerealRepository.save(cereal);
    }

    @Override
    public Lupulo saveLupulo(Lupulo lupulo) {
        return lupuloRepository.save(lupulo);
    }
}
