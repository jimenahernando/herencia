package com.jimenahernando.herencia.service;

import com.jimenahernando.herencia.model.entities.mappedSuperclass.Cereal;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Lupulo;
import com.jimenahernando.herencia.model.entities.mappedSuperclass.Producto;

import java.util.List;

public interface ProductosService {

    List<Cereal> getCereales();

    List<Lupulo> getLupulos();

    List<Producto> getProductos();

    Cereal saveCereal(Cereal cereal);

    Lupulo saveLupulo(Lupulo lupulo);
}
