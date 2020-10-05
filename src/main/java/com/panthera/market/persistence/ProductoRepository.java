package com.panthera.market.persistence;

import com.panthera.market.persistence.crud.ProductoCrudRepository;
import com.panthera.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
