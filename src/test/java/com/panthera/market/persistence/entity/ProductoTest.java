package com.panthera.market.persistence.entity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProductoTest {

    @Test
    void InstanceProductoDefaultValues() {
        // Arrange & Act
        Producto tester = new Producto();

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
        Producto tester = new Producto();
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
        Producto tester = new Producto();
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
        Producto tester = new Producto();
        final Categoria idCategoria = new Categoria();

        //Act
        tester.setCategoria(idCategoria);
        final Categoria getCategoria = tester.getCategoria();

        // Assert
        assertEquals(idCategoria, getCategoria, "setCategoria must be new Categoria()");
    }


    @Test
    void getAndSetCodigoBarras() {
        // Arrange
        Producto tester = new Producto();
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
        Producto tester = new Producto();
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
        Producto tester = new Producto();
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
        Producto tester = new Producto();
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
        Producto tester = new Producto();
        final Categoria categoria = new Categoria();

        //Act
        tester.setCategoria(categoria);
        final Categoria getCategoria = tester.getCategoria();

        // Assert
        assertEquals(categoria, getCategoria, "setCategoria must be new Categoria()");
    }
}
