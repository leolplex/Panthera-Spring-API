package com.panthera.market.persistence.entity;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaTest {

    @Test
    void InstanceCategoriaDefaultValues() {
        // Arrange & Act
        Categoria tester = new Categoria();

        // Assert
        assertNull(tester.getIdCategoria(), "getIdCategoria must be null");
        assertNull(tester.getDescripcion(), "getDescripcion must be null");
        assertNull(tester.getEstado(), "getEstado must be null");
        assertNull(tester.getProductos(), "getEstado must be null");
    }

    @Test
    void getAndSetIdCategoria() {
        // Arrange
        Categoria tester = new Categoria();
        final int idCategoria = 500;

        //Act
        tester.setIdCategoria(idCategoria);
        final int getIdCategoria = tester.getIdCategoria();

        // Assert
        assertEquals(idCategoria, getIdCategoria, "setIdCategoria must be 500");
    }

    @Test
    void getAndSetDescripcion() {
        // Arrange
        Categoria tester = new Categoria();
        final String descripcion = "My Category";

        //Act
        tester.setDescripcion(descripcion);
        final String getDescripcion = tester.getDescripcion();

        // Assert
        assertEquals(descripcion, getDescripcion, "setDescripcion must be My Category");
    }

    @Test
    void getAndSetEstado() {
        // Arrange
        Categoria tester = new Categoria();
        final boolean estado = true;

        //Act
        tester.setEstado(estado);
        final boolean getEstado = tester.getEstado();

        // Assert
        assertEquals(estado, getEstado, "setEstado must be true");
    }

    @Test
    void getAndSetProductos() {
        // Arrange
        Categoria tester = new Categoria();
        final List<Producto> productos = new ArrayList<>();

        //Act
        tester.setProductos(productos);
        final List<Producto> getProductos = tester.getProductos();

        // Assert
        assertEquals(productos, getProductos, "setProductos must be []");
    }
}
