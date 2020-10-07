package com.panthera.market.persistence.entity;

import com.panthera.market.persistence.ProductoRepository;
import com.panthera.market.persistence.crud.ProductoCrudRepository;
import com.panthera.market.persistence.mapper.ProductMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

class ProductoTest {
    Producto tester;

    @BeforeEach
    void initEach() {
        // Arrange
        tester = new Producto();
    }


    @Test
    void InstanceProductoDefaultValues() {

        // Assert
        assertNull(tester.getIdProducto(), "getId must be null");
        assertNull(tester.getNombre(), "getCantidad must be null");
        assertNull(tester.getIdCategoria(), "getCantidad must be null");
        assertNull(tester.getCodigoBarras(), "getCantidad must be null");
        assertNull(tester.getPrecioVenta(), "getCantidad must be null");
        assertNull(tester.getCantidadStock(), "getCantidad must be null");
        assertNull(tester.getEstado(), "getCantidad must be null");
        assertNull(tester.getCategoria(), "getCantidad must be null");
    }

    @Test
    void getAndSetIdProducto() {
        // Arrange
        final int idProducto = 100;

        //Act
        tester.setIdProducto(idProducto);
        final int getIdProducto = tester.getIdProducto();

        // Assert
        assertEquals(idProducto, getIdProducto, "setIdProducto must be 100");
    }

    @Test
    void getAndSetNombre() {
        // Arrange
        final String nombre = "my name";

        //Act
        tester.setNombre(nombre);
        final String getNombre = tester.getNombre();

        // Assert
        assertEquals(nombre, getNombre, "setNombre must be my name");
    }

    @Test
    void getAndSetIdCategoria() {
        // Arrange
        final int idCategoria = 652;

        //Act
        tester.setIdCategoria(idCategoria);
        final int getIdCategoria = tester.getIdCategoria();

        // Assert
        assertEquals(idCategoria, getIdCategoria, "setIdCategoria must be 652");
    }


    @Test
    void getAndSetCodigoBarras() {
        // Arrange
        final String codigoBarras = "23132sda2asd131as23d";

        //Act
        tester.setCodigoBarras(codigoBarras);
        final String getCodigoBarras = tester.getCodigoBarras();

        // Assert
        assertEquals(codigoBarras, getCodigoBarras, "setCodigoBarras must be 23132sda2asd131as23d");
    }

    @Test
    void getAndSetPrecioVenta() {
        // Arrange
        final Double precioVenta = 15213.2562;

        //Act
        tester.setPrecioVenta(precioVenta);
        final Double getPrecioVenta = tester.getPrecioVenta();

        // Assert
        assertEquals(precioVenta, getPrecioVenta, "setPrecioVenta must be 15213.2562");
    }

    @Test
    void getAndSetCantidadStock() {
        // Arrange
        final int cantidadStock = 2562;

        //Act
        tester.setCantidadStock(cantidadStock);
        final int getCantidadStock = tester.getCantidadStock();

        // Assert
        assertEquals(cantidadStock, getCantidadStock, "setCantidadStock must be 2562");
    }

    @Test
    void getAndSetEstado() {
        // Arrange
        final boolean estado = true;

        //Act
        tester.setEstado(estado);
        final boolean getCantidadStock = tester.getEstado();

        // Assert
        assertEquals(estado, getCantidadStock, "setEstado must be true");
    }

    @Test
    void getAndSetCategoria() {
        // Arrange
        final Categoria categoria = new Categoria();

        //Act
        tester.setCategoria(categoria);
        final Categoria getCategoria = tester.getCategoria();

        // Assert
        assertEquals(categoria, getCategoria, "setCategoria must be new Categoria()");
    }
}
